package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 18.04.2018.
 */
public class Table {

    private String id;
    private boolean isReserve;
    List<Drink> drinks;
    List<Meal> meals;


    public Table(String id) {
        drinks = new ArrayList<>();
        meals = new ArrayList<>();
        this.id = id;

    }

    public double calculateCost() {
        double totalCost = 0.0;
        for (int i = 0; i < drinks.size(); i++) {
            totalCost += drinks.get(i).getPrice();

        }
        for (int i = 0; i < meals.size(); i++) {
            totalCost += meals.get(i).getPrice();

        }
        return totalCost;


    }

    public void addMeal(Meal meal) {
        if (!meals.contains(meal)) meals.add(meal);
        else {
            int a = meals.indexOf(meal);

            meals.get(a).setAmountofMaterial(meals.get(a).getAmountofMaterial() + 1);

        }

    }

    public void addMeal(Meal meal, int count) {
        if (!meals.contains(meal)) {
            meal.setAmountofMaterial(count);
            meals.add(meal);
        } else {
            int a = meals.indexOf(meal);

            meals.get(a).setAmountofMaterial(meals.get(a).getAmountofMaterial() + count);

        }

    }

    public void addDrink(Drink drink) {
        if (!drinks.contains(drink)) drinks.add(drink);
        else {
            int a = drinks.indexOf(drink);

            drinks.get(a).setAmountofMaterial(drinks.get(a).getAmountofMaterial() + 1);

        }

    }

    public void addDrink(Drink drink, int count) {
        if (!meals.contains(drink)) {
            drink.setAmountofMaterial(count);
            drinks.add(drink);
        } else {
            int a = meals.indexOf(drink);

            drinks.get(a).setAmountofMaterial(drinks.get(a).getAmountofMaterial() + count);

        }

    }

    public void printBill(){

        System.out.println("\n- - - - - Bill of "+this.getId()+" - - - - - ");
        System.out.println("Name\tPrice\tCalories");
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i).getName() + "\t" + drinks.get(i).getPrice() + "\t" +
                    String.format("%.2f", drinks.get(i).getCalories().calculatingCalories()));
        }
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i).getName() + "\t" + meals.get(i).getPrice() + "\t" +
                    String.format("%.2f", meals.get(i).getCalories().calculatingCalories()));
        }
        System.out.println("Total Cost of Table: "+String.format("%.2f",calculateCost()));


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isReserve() {
        return isReserve;
    }

    public void setReserve(boolean reserve) {
        isReserve = reserve;
    }

}
