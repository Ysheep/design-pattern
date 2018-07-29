package com.Ysheep.abstractFactory;

/**
 * 不同的操作
 * 不同系统的多控制方式操作控制
 */
public class OperationFactory implements AbstractFactory {

    public Linux installLinux() {
        System.out.println("安装Linux操作控制系统");
        return new LinuxController();
    }

    public Windows installWindows() {
        System.out.println("安装Windows操作控制系统");
        return new WindowsController();
    }
}
