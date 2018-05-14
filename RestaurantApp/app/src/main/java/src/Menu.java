package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 17.04.2018.
 */
public class Menu {

    private int year;
    private List<Drink> drinks;
    private List<Meal> meals;

    public Menu() {
        drinks = new ArrayList<>();
        meals = new ArrayList<>();
    }

    public void addingMeal(Meal meal) {
        if (!meals.contains(meal))
            meals.add(meal);
    }

    public void addingDrink(Drink drink) {

        if (!drinks.contains(drink))
            drinks.add(drink);
    }

    public void deletingMeal(Meal meal) {
        meals.remove(meal);
    }

    public void deletingDrink(Drink drink) {
        drinks.remove(drink);
    }

    public void printMenu() {
        System.out.println("\n- - - - - Drinks - - - - - ");
        System.out.println("Name\tPrice\tCalories");
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i).getName() + "\t" + drinks.get(i).getPrice() + "\t" +
                    String.format("%.2f", drinks.get(i).getCalories().calculatingCalories()));
        }
        System.out.println("\n- - - - - Meals - - - - - ");
        System.out.println("Name\tPrice\tCalories");
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i).getName() + "\t" + meals.get(i).getPrice() + "\t" +
                    String.format("%.2f", meals.get(i).getCalories().calculatingCalories())
            );
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
