package patterns.singleton;

public class SingltonPatternDemo {
    public static void test() {
        System.out.println("单例模式 -------start");
        SingleObject.getInstance().showMessage();
        System.out.println("单例模式 -------end");
    }
}
