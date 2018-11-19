package patterns.bridge;

public class BridgePatternDemo {
    public static void test() {
        System.out.println("\n桥接模式-------start");
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
        System.out.println("桥接模式-------end");
    }
}
