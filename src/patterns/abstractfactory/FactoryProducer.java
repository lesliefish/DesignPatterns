package patterns.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null)
            return null;

        if (factoryType.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (factoryType.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }

        return null;
    }
}
