import patterns.abstractfactory.AbstractFactoryPatternDemo;
import patterns.adapter.AdapterPatternDemo;
import patterns.bridge.BridgePatternDemo;
import patterns.builder.BuilderPatternDemo;
import patterns.builder.MealBuilder;
import patterns.chain.ChainPatternDemo;
import patterns.command.CommandPatternDemo;
import patterns.composite.CompositePatternDemo;
import patterns.decorator.DecoratorPatternDemo;
import patterns.facade.FacadePatternDemo;
import patterns.factory.FactoryPatternDemo;
import patterns.filter.FilterPatternDemo;
import patterns.flyweight.FlyweightPatternDemo;
import patterns.interpreter.InterpreterPatternDemo;
import patterns.iterator.IteratorPatternDemo;
import patterns.prototype.PrototypePatternDemo;
import patterns.proxy.ProxyPatternDemo;
import patterns.singleton.SingltonPatternDemo;

public class DesignPatterns {

    public static void main(String[] args) {
        // 工厂模式
        FactoryPatternDemo.test();
        // 抽象工厂模式
        AbstractFactoryPatternDemo.test();
        // 单例模式
        SingltonPatternDemo.test();
        // 创建型模式
        BuilderPatternDemo.test();
        // 原型模式
        PrototypePatternDemo.test();
        // 适配器模式
        AdapterPatternDemo.test();
        // 桥接模式
        BridgePatternDemo.test();
        // 复合型模式
        CompositePatternDemo.test();
        // 代理模式
        ProxyPatternDemo.test();
        // 过滤模式
        FilterPatternDemo.test();
        // 装饰器模式
        DecoratorPatternDemo.test();
        // 外观模式
        FacadePatternDemo.test();
        // 享元模式
        FlyweightPatternDemo.test();
        // 责任链模式
        ChainPatternDemo.test();
        // 命令行模式
        CommandPatternDemo.test();
        // 解释器模式
        InterpreterPatternDemo.test();
        // 迭代器模式
        IteratorPatternDemo.test();
    }
}
