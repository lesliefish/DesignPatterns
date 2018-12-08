package patterns.memento;

public class MementoPatternDemo {
    public static void test() {
        System.out.println("\n备忘录模式 -------start");

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());

        originator.restoreStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.restoreStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

        System.out.println("备忘录模式 -------end");
    }
}
