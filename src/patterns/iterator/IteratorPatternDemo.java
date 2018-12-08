package patterns.iterator;

public class IteratorPatternDemo {
    public static void test() {
        System.out.println("\n迭代器模式 -------start");

        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name: " + name);
        }

        System.out.println("迭代器模式 -------end");
    }
}
