package patterns.builder;

public class BuilderPatternDemo {

    public static void test() {

        System.out.println("\n创建型模式-------start");

        MealBuilder mealBuilder = new MealBuilder();
        System.out.println("\nVeg Meal");
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("veg total cost : " + vegMeal.getCost());

        System.out.println("\nNone Veg Meal");
        Meal noneVegMeal = mealBuilder.prepareNoneVegMeal();
        noneVegMeal.showItems();
        System.out.println("none veg total cost : " + noneVegMeal.getCost());

        System.out.println("创建型模式 -------end");
    }
}
