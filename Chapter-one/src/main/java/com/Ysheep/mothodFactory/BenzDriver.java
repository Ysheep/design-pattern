package com.Ysheep.mothodFactory;

public class BenzDriver implements Driver {

    public Car driverCar() {
        System.out.println("实例化benz car实体类");
        return new Benz();
    }
}
