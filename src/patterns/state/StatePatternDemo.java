package patterns.state;

public class StatePatternDemo {

    public static void test() {

        System.out.println("\n状态模式--------start");
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());

        System.out.println("状态模式--------end");
    }
}
