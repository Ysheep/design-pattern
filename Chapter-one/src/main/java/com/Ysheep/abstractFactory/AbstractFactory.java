package com.Ysheep.abstractFactory;

/**
 * 创建一个工厂类，基于接口分别实现操作控制和界面控制两种方式的工厂
 */
public interface AbstractFactory {

    Linux installLinux();

    Windows installWindows();
}
