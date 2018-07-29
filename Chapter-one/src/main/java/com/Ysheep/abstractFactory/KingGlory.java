package com.Ysheep.abstractFactory;


public class KingGlory {

    public static void main(String[] args) {
        AbstractFactory operationFactory = new OperationFactory();
        operationFactory.installLinux().controller();
        operationFactory.installWindows().controller();
        System.out.println("========================================================");
        AbstractFactory interfaceFactory = new InterfaceFactory();
        interfaceFactory.installLinux().controller();
        interfaceFactory.installWindows().controller();
    }
}
