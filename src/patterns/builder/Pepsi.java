package patterns.builder;

// 百事可乐
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
