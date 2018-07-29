package com.Ysheep.mothodFactory;

/**
 * 工厂模式
 * 1.抽象工厂角色类  driver
 * 2.具体工厂角色类  BenzDriver,BmwDriver 必须继承或实现 抽象工厂类。实现具体的业务逻辑代码。创建具体的产品对象。
 * 3.抽象产品角色类  Car
 * 4.具体产品角色类  Benz Bmw
 * 工厂方法使用一个抽象工厂角色作为核心来代替在简单工厂模式中使用具体类作为核心。
 * 让我们来看看工厂方法模式给我们带来了什么？使用开闭原则来分析下工厂方法模式。
 * 当有新的产品（即暴发户的汽车）产生时，只要按照抽象产品角色、抽象工厂角色提供的合同来生成，
 * 那么就可以被客户使用，而不必去修改任何已有的代码。
 * 看来，工厂方法模式是完全符合开闭原则的！
 * 缺点:
 * 每次需要编写新的对象和对象工厂类，随业务发展，一定程度上增加了系统复杂度
 */
public class Client {

    public static void main(String[] args) {
        BmwDriver  bmwDrvier = new BmwDriver();//创建工厂类
        Car bmw = bmwDrvier.driverCar();//通过工厂类创建具体产品角色
        bmw.drive();//执行工作

        BenzDriver benzDriver = new BenzDriver();
        Car benzCar = benzDriver.driverCar();
        benzCar.drive();//benz
    }
}
