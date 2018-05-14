package src;

import java.util.ArrayList;

/**
 * Created by Furkan on 18.04.2018.
 */
public class Waiter extends Employee {

    private int experienceDay;
    private String possition;

    public Waiter(String name, String surname, int age, String address, int phoneNumber, String restDay, double salary) {
        super(name, surname, age, address, phoneNumber, restDay, salary);
        possition = null;
    }

    public Waiter(String name, String surname, double salary) {
        super(name, surname, salary);
        possition = null;
    }

    public void takingOrder(Table t1, Drink drink) {
        t1.addDrink(drink);
    }

    public void takingOrder(Table t1, Meal meal) {
        t1.addMeal(meal);
    }

    public void setPosition() {
        this.possition = "waiter";
    }

    public void preparingTable(Table t1) {

        t1.meals = new ArrayList<>();
        t1.drinks = new ArrayList<>();
        t1.setReserve(false);

    }

    public void meetingCustomer(Table t1) {
        t1.setReserve(true);
    }

    public int getExperienceDay() {
        return experienceDay;
    }

    public void setExperienceDay(int experienceDay) {
        this.experienceDay = experienceDay;
    }

    public String toString() {
        return "Waiter";
    }

}

