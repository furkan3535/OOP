package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 18.04.2018.
 */
public class Organization {
    public Restaurant rst;
    public Material milk;

    public Material sugar;
    public Material syrup;
    public Material bun;
    public Material groundBeef;
    public Material potato;
    public Material groundCoffee;
    public NutritionalValue nutrive0;
    public NutritionalValue nutrive1;
    public NutritionalValue nutrive2;
    public NutritionalValue nutrive3;
    public NutritionalValue nutrive4;
    public Drink water;
    public Drink latte;
    public Drink mocha;
    public Meal hamburger;
    public Meal frenchFries;
    public Menu menu;
    public Table table1;
    public Table table2;
    public Table table3;


    public Organization() {
        rst = new Restaurant(5000, 15000);
        menu = new Menu();
        setup();
    }

    public void setup() {



        /*Materials..*/
        milk = new Material("Drink", "always");
        sugar = new Material("Drink", "always");
        groundCoffee = new Material("Drink", "always");
        syrup = new Material("Drink", "always");
        bun = new Material("Food", "always");
        groundBeef = new Material("Food", "always");
        potato = new Material("Food", "always");

        nutrive0 = new NutritionalValue(0, 0, 0);
        nutrive1 = new NutritionalValue(0.8, 0.12, 0.8);
        nutrive2 = new NutritionalValue(0.7, 0.10, 0.5);
        nutrive3 = new NutritionalValue(5.8, 5.3, 15.8);
        nutrive4 = new NutritionalValue(10.8, 5.3, 8.8);

        water = new Drink("water", 10.0, "drink", nutrive0);
        latte = new Drink("latte", 10.5, "drink", nutrive1);
        latte.addingMaterial(milk);
        latte.addingMaterial(groundCoffee);

        mocha = new Drink("mocha", 11.5, "drink", nutrive2);
        mocha.addingMaterial(groundCoffee);
        mocha.addingMaterial(milk, 3);
        mocha.addingMaterial(syrup);
        mocha.addingMaterial(syrup);
        mocha.addingMaterial(syrup);

        hamburger = new Meal("burger", "meal", 15.5, nutrive3);
        hamburger.addingMaterial(bun);
        hamburger.addingMaterial(groundBeef);

        frenchFries = new Meal("Fries", "meal", 15.5, nutrive4);
        frenchFries.addingMaterial(potato);

        Supply potatoes = new Supply("Potato", "Food", true, 1);
        Supply tomato = new Supply("Tomato", "Food", true, 1.5);

        List<Supply> supplies = new ArrayList<>();
        supplies.add(potatoes);
        supplies.add(tomato);
        Storage storage1 = new Storage(supplies, 5, "available");
        storage1.printStorage();

        menu.addingDrink(latte);
        menu.addingDrink(mocha);
        menu.addingDrink(water);
        menu.addingMeal(hamburger);
        menu.addingMeal(frenchFries);

        //menu.printMenu();

        Waiter emp = new Waiter("Selim", "Demir", 1500);
        Employee emp2 = new ChefBarista("Talat", "Yaman", 1800);
        Employee emp3 = new Boss("Ahmet", "Abi  ", 2200);
        rst.hireEmployee(emp);
        rst.hireEmployee(emp2);
        rst.hireEmployee(emp3);
        rst.printEmployees();

        table1 = new Table("A1");
        table2 = new Table("A2");
        table3 = new Table("A3");

       /* table1.addDrink(water, 4);
        table1.addMeal(hamburger);
        table1.addDrink(latte);
        table2.addDrink(mocha, 2);
        table2.addMeal(frenchFries, 2);*/
        //table1.printBill();
        //table2.printBill();


        // Waiter operation..

       /* emp.takingOrder(table3, hamburger);
        emp.takingOrder(table3, latte);*/

        //table3.printBill();
        // To clean table and bill
        //emp.meetingCustomer(table3);


    }
}
