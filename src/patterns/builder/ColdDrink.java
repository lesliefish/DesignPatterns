package patterns.builder;

// 冷饮
public abstract class ColdDrink implements Item {
    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
