package patterns.proxy;

public class ProxyPatternDemo {
    public static void test() {
        System.out.println("\n代理模式------start");

        Image image = new ProxyImage("myfile.image");
        System.out.println("first display:"); // 只有第一次加载时去磁盘加载图片
        image.diasplay();

        System.out.println("second display:");

        image.diasplay();
        System.out.println("代理模式------end");
    }
}
