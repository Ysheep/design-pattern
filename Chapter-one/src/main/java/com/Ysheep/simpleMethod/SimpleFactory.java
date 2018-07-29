/**
 * 工厂类
 * 工厂类角色
 * 简单工厂违背了开闭原则，存在耦合。
 * 使用场景: 创建简单，无复杂的业务逻辑对象
 */
public class SimpleFactory {

    public final static String CIRCLE = "CIRCLE";
    public final static String SQUARE = "SQUARE";

    public static Shape getFactory(String type) {
       if(CIRCLE.equals(type)) {
           return new Circle();
       }else if(SQUARE.equals(type)){
           return new Square();
       }else{
           return null;
       }
    }

}
