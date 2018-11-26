package patterns.facade;

public class FacadePatternDemo {

    public static void test() {
        System.out.println("外观模式-----start");

        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();

        System.out.println("外观模式-----end");
    }
}
