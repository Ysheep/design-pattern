/**
 * 工厂类
 * 工厂类角色
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
