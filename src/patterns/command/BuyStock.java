package patterns.command;

public class BuyStock implements Order {

    private Stock absStock;

    public BuyStock(Stock stock){
        this.absStock = stock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}
