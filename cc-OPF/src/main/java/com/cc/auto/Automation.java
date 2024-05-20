package com.cc.auto;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/13
 * Time: 16:21
 * Description:
 * java.awt.Robot机器人类
 * 主要用于测试自动化、自动运行演示程序和其它需要鼠标和键盘控制的应用程序生成本机系统输入事件
 * 基本使用：
 * 1.鼠标操作
 *   1）mouseMove(int x,int y)   :以左上角为原点，移动鼠标到距离左x像素，距离上y像素
 *   2）mousePress(int button)   :按下鼠标的左键/右键/滚轮
 *   3）mouseRelease(int button) :释放鼠标的左键/右键/滚轮
 *     左键：InputEvent.BUTTON1_MASK
 *     滚轮：InputEvent.BUTTON2_MASK
 *     右键：InputEvent.BUTTON3_MASK
 *   4）mouseWheel(int wheelAmt) :鼠标滚轮滑动，参数<0:向上滚动，参数大于0:向下滚动
 * 2.键盘操作
 *   1）keyPress(int keyCode)    :鼠标按下指定键keyCode
 *   2）keyRelease(int keyCode)  :鼠标释放指定键keyCode
 * 3.Robot其它操作
 *   1）delay(int ms)            :睡眠/延时(单位毫秒)
 *   2）setAutoDelay(int ms)     :设置robot每生成一个事件后自动睡眠时间
 *   3）waitForIdle()            :处理事件队列的所有事件之前一直等待
 *   4）setAutoWaitForIdle(Boolean isOn)
 *     robot生成一个事件后是否自动调用waitForIdle()，true:表示添加的事件按顺序执行
 *   5）Dimension screen = Toolkit.getDefaultToolkit().getScreenSize()
 *     screen.width/screen.getWidth()    :获取屏幕宽
 *     screen.height/screen.getHeight()  :获取屏幕高
 *   6）Point location = MouseInfo.getPointerInfo().getLocation()
 *     location.x/location.getX()        :距离左位置
 *     location.y/location.getY()        :距离上位置
 *   7）Runtime.getRuntime().exec(String command) :使用命令启动应用程序
 */

public class Automation {

    // 鼠标左键点击事件
    public static void onclick(Integer x, Integer y) throws AWTException {
        Robot robot = new Robot();
        // 初始鼠标
        robot.mouseMove(0,0);
        // 移动鼠标
        robot.mouseMove(x,y);
        robot.delay(200);
        // 执行1次点击
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

}
