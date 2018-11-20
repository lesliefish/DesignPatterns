package patterns.composite;

public class CompositePatternDemo {
    public static void test() {
        System.out.println("\n复合型模式------start");

        Employee ceo = new Employee("LAO K", "CEO", 50000);
        Employee headSales = new Employee("AA", "Head Sales", 20000);
        Employee headMarketing = new Employee("BB", "Head Marketing", 20000);
        Employee clerk1 = new Employee("CC", "Marketing", 10000);
        Employee clerk2 = new Employee("DD", "Marketing", 10000);
        Employee sales1 = new Employee("EE", "Sales", 10000);
        Employee sales2 = new Employee("FF", "Sales", 10000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(sales1);
        headSales.add(sales2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);

        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

        System.out.println("复合型模式------end");
    }
}
