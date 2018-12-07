package patterns.command;

public class CommandPatternDemo {
    public static void test() {

        System.out.println("\n命令行模式------start");
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();

        System.out.println("命令行模式------start");
    }
}
