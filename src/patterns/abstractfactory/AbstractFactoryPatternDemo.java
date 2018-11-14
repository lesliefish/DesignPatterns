package patterns.abstractfactory;

public class AbstractFactoryPatternDemo {

    public  static void test(){
        System.out.println("抽象工厂模式 -------start");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        System.out.println("抽象工厂模式 -------end\n");
    }
}
