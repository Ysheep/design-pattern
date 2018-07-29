package com.Ysheep.abstractFactory;

public class InterfaceFactory implements AbstractFactory {

    public Linux installLinux() {
        System.out.println("安装Linux界面控制系统");
        return new LinuxController();
    }

    public Windows installWindows() {
        System.out.println("安装Windows界面控制系统");
        return new WindowsController();

    }
}
