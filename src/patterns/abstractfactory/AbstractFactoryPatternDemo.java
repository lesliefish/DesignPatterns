package patterns.abstractfactory;

public class AbstractFactoryPatternDemo {

    public  static void test(){
        System.out.println("抽象工厂模式 -------start");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Shape circleShape = shapeFactory.getShape("Circle");
        Shape squareShape = shapeFactory.getShape("Square");
        Shape rectangleShape = shapeFactory.getShape("Rectangle");

        circleShape.draw();
        squareShape.draw();
        rectangleShape.draw();

        Color redColor = colorFactory.getColor("Red");
        Color greenColor = colorFactory.getColor("Green");
        Color blueColor = colorFactory.getColor("Blue");

        redColor.fill();
        greenColor.fill();
        blueColor.fill();

        System.out.println("抽象工厂模式 -------end\n");
    }
}
