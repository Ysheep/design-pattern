public class Client {

    public static  void main (String[] args) {

        Shape circle = SimpleFactory.getFactory(SimpleFactory.CIRCLE);
        circle.draw();

        Shape square = SimpleFactory.getFactory(SimpleFactory.SQUARE);
        square.draw();

    }
}
