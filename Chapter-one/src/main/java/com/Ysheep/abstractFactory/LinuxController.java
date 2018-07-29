package com.Ysheep.abstractFactory;

/**
 * .基于不同操作系统实现控制逻辑
 */
public class LinuxController implements Linux {

    public void controller() {
        System.out.println("Linux 控制 《王者荣耀》");
    }
}
