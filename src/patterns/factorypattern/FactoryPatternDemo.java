package patterns.factorypattern;

public class FactoryPatternDemo {

    public void test(){
        System.out.println("工厂模式 -------start");
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = shapeFactory.getShape("Circle");
        circleShape.draw();

        Shape rectangleShape = shapeFactory.getShape("Rectangle");
        rectangleShape.draw();

        Shape squareShape = shapeFactory.getShape("Square");
        squareShape.draw();
        System.out.println("工厂模式 -------end\n");
    }
}
