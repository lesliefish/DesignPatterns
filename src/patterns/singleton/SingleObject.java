package patterns.singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
        // 私有化构造函数
    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("I am a singleton test.");
    }
}
