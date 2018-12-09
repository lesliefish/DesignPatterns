package patterns.template;

public class TemplatePatternDemo {

    public static void test() {

        System.out.println("\n模板模式-------start");

        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();

        System.out.println("\n模板模式-------end");
    }
}
