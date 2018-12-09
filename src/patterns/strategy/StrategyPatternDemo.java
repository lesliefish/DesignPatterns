package patterns.strategy;

public class StrategyPatternDemo {

    public static void test() {

        System.out.println("\n策略模式--------start");

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.changeStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context.changeStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        System.out.println("策略模式--------end");
    }
}
