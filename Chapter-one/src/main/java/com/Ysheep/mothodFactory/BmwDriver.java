package com.Ysheep.mothodFactory;

public class BmwDriver implements Driver {

    public Car driverCar() {
        System.out.println("实例化bmw car实体类");
        return new Bmw();
    }
}
