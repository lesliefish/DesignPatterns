package patterns.observer;

public class ObserverPatternDemo {

    public static void test() {
        System.out.println("\n观察者模式--------start");

        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        subject.setState(15);
        subject.setState(10);

        System.out.println("观察者模式--------end");
    }

}
