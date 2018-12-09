package patterns.nullobject;

public class NullObjectPatternDemo {

    public static void test() {
        System.out.println("\n空对象模式---------start");

        AbstractCustomer customer1 = new CustomerFactory().getCustomer("Rob");
        AbstractCustomer customer2 = new CustomerFactory().getCustomer("Bob");
        AbstractCustomer customer3 = new CustomerFactory().getCustomer("Julie");
        AbstractCustomer customer4 = new CustomerFactory().getCustomer("Mark");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

        System.out.println("空对象模式---------end");
    }
}
