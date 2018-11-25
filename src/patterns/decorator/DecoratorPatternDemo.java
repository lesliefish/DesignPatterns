package patterns.decorator;

public class DecoratorPatternDemo {
    public static void test() {
        System.out.println("\n装饰器模式 -------start");

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("normal circle");
        circle.draw();

        System.out.println("red circle");
        redCircle.draw();

        System.out.println("red rectangle");
        redRectangle.draw();

        System.out.println("装饰器模式 -------end\n");
    }
}
