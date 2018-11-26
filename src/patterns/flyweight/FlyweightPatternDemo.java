package patterns.flyweight;

public class FlyweightPatternDemo {

    private static final String[] colorArray = {"Green", "Red", "Blue", "Yellow", "Black"};

    public static void test() {

        System.out.println("\n享元模式 -------start");

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(100);
            circle.draw();
        }

        System.out.println("享元模式 -------end");
    }

    private static String getRandomColor() {
        return colorArray[(int) (Math.random() * colorArray.length)];
    }

    private static int getRandom() {
        return (int) (Math.random() * 100);
    }
}
