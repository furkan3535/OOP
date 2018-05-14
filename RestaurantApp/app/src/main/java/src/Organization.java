package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 18.04.2018.
 */
public class Organization {
    public static void main(String[] args) {

        Restaurant rst = new Restaurant(5000, 15000);

        /*Materials..*/
        Material milk = new Material("Drink", "always");
        Material sugar = new Material("Drink", "always");
        Material groundCoffee = new Material("Drink", "always");
        Material syrup = new Material("Drink", "always");
        Material bun = new Material("Food", "always");
        Material groundBeef = new Material("Food", "always");
        Material potato = new Material("Food", "always");

        NutritionalValue nutrive0 = new NutritionalValue(0, 0, 0);
        NutritionalValue nutrive1 = new NutritionalValue(0.8, 0.12, 0.8);
        NutritionalValue nutrive2 = new NutritionalValue(0.7, 0.10, 0.5);
        NutritionalValue nutrive3 = new NutritionalValue(5.8, 5.3, 15.8);
        NutritionalValue nutrive4 = new NutritionalValue(10.8, 5.3, 8.8);

        Drink water = new Drink("water", 10.0, "drink", nutrive0);
        Drink latte = new Drink("latte", 10.5, "drink", nutrive1);
        latte.addingMaterial(milk);
        latte.addingMaterial(groundCoffee);

        Drink mocha = new Drink("mocha", 11.5, "drink", nutrive2);
        mocha.addingMaterial(groundCoffee);
        mocha.addingMaterial(milk, 3);
        mocha.addingMaterial(syrup);
        mocha.addingMaterial(syrup);
        mocha.addingMaterial(syrup);

        Meal hamburger = new Meal("burger", "meal", 15.5, nutrive3);
        hamburger.addingMaterial(bun);
        hamburger.addingMaterial(groundBeef);

        Meal frenchFries = new Meal("Fries", "meal", 15.5, nutrive4);
        frenchFries.addingMaterial(potato);

        Supply potatoes = new Supply("Potato", "Food", true, 1);
        Supply tomato = new Supply("Tomato", "Food", true, 1.5);

        List<Supply> supplies = new ArrayList<>();
        supplies.add(potatoes);
        supplies.add(tomato);
        Storage storage1 = new Storage(supplies, 5, "available");
        storage1.printStorage();

        Menu menu = new Menu();
        menu.addingDrink(latte);
        menu.addingDrink(mocha);
        menu.addingDrink(water);
        menu.addingMeal(hamburger);
        menu.addingMeal(frenchFries);

        menu.printMenu();

        Waiter emp = new Waiter("Selim", "Demir", 1500);
        Employee emp2 = new ChefBarista("Talat", "Yaman", 1800);
        Employee emp3 = new Boss("Ahmet", "Abi  ", 2200);
        rst.hireEmployee(emp);
        rst.hireEmployee(emp2);
        rst.hireEmployee(emp3);
        rst.printEmployees();

        Table table1 = new Table("A1");
        Table table2 = new Table("A2");
        table1.addDrink(water, 4);
        table1.addMeal(hamburger);
        table1.addDrink(latte);
        table2.addDrink(mocha, 2);
        table2.addMeal(frenchFries, 2);
        table1.printBill();
        table2.printBill();


        // Waiter operation..
        Table table3 = new Table("A3");
        emp.takingOrder(table3, hamburger);
        emp.takingOrder(table3, latte);

        table3.printBill();
        // To clean table and bill
        emp.meetingCustomer(table3);


    }
}
