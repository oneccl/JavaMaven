package com.cc;

import com.sun.istack.internal.NotNull;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/15
 * Time: 20:19
 * Description:
 */
// IOC容器简单实现
public class SpringIOC {

    // 用于存储单例bean
    private Map<String, Object> beans;

    // 初始化beans容器(将bean加载到beans容器)
    public <E> void initBeans(@NotNull String name, @NotNull Class<E> cla, Object... v) throws Exception {
        for (int i = 0; i < v.length; i++) {
            (new Class<?>[v.length])[i] = v[i].getClass();
        }
        synchronized (SpringIOC.class){
            if (beans == null){
                beans = new ConcurrentHashMap<>();
            }
        }
        beans.put(name, new BeanFactory().newSingleton(cla, v));
    }

    // 初始化beans容器(将bean加载到beans容器)
    public <E> void initBeans(@NotNull Class<E> cla, Object... v) throws Exception {
        for (int i = 0; i < v.length; i++) {
            (new Class<?>[v.length])[i] = v[i].getClass();
        }
        synchronized (SpringIOC.class){
            if (beans == null){
                beans = new ConcurrentHashMap<>();
            }
        }
        String name = classNameFirstCharToLowerCase(cla);
        beans.put(name, new BeanFactory().newSingleton(cla, v));
    }

    // 根据名称获取单例bean
    public Object getBean(String name) {
        Object o = null;
        for (String s : beans.keySet()) {
            if (s.equals(name)) {
                o = beans.get(name);
            }
        }
        return o;
    }

    // 根据类的class对象获取单例bean
    public <E> E getBean(Class<E> cla) throws Exception {
        for (String s : beans.keySet()) {
            E e = (E) beans.get(s);
            if ((e.getClass()).equals(cla)){
                return e;
            }
        }
        return null;
    }

    // 将类名第一个字母小写，其它不变转为字符串形式
    private <E> String classNameFirstCharToLowerCase(Class<E> cla){
        String name = cla.getSimpleName();
        String s = (name.charAt(0) + "").toLowerCase();
        return name.replace(name.charAt(0), s.charAt(0));
    }

    // JavaBean工厂
    private static class BeanFactory{

        // 可通信的单例bean
        private volatile Object bean;

        // 工厂线程安全的生产单例bean
        private <E> E newSingleton(@NotNull Class<E> cla, Object... v) throws Exception {
            if (bean == null) {
                Class<?>[] classes = new Class<?>[v.length];
                for (int i = 0; i < v.length; i++) {
                    classes[i] = v[i].getClass();
                }
                Constructor<E> constructor = cla.getDeclaredConstructor(classes);
                constructor.setAccessible(true);
                synchronized (SpringIOC.class) {
                    if (bean == null) {
                        bean = constructor.newInstance(v);
                    }
                }
            }
            return (E) bean;
        }

    }

}
