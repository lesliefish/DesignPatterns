package patterns.mediator;

public class MediatorPatternDemo {

    public static void test() {
        System.out.println("\n中介模式 -------start");

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("hi, John");
        john.sendMessage("hi, Robert");

        System.out.println("中介模式 -------start");
    }
}
