import patterns.abstractfactory.AbstractFactoryPatternDemo;
import patterns.builder.BuilderPatternDemo;
import patterns.builder.MealBuilder;
import patterns.factory.FactoryPatternDemo;
import patterns.singleton.SingltonPatternDemo;

public class DesignPatterns {

    public static void main(String[] args)
    {
        // 工厂模式
        FactoryPatternDemo.test();
        // 抽象工厂模式
        AbstractFactoryPatternDemo.test();
        // 单例模式
        SingltonPatternDemo.test();
        // 创建型模式
        BuilderPatternDemo.test();
    }
}
