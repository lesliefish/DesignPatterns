package patterns.prototype;

public class PrototypePatternDemo {
    public static void test() {
        System.out.println("\n原型模式 -------start");

        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        System.out.println("原型模式 -------end");
    }
}
