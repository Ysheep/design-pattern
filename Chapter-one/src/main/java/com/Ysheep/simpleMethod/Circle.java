/**
 * 声明一个圆型，实现Shape，重写画方法。
 */
public class Circle implements Shape {

    public Circle() {
            System.out.println("创建一个圆型!");
    }

    public void draw() {
        System.out.println("画了一个圆形!");
    }
}
