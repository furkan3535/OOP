package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 30.04.2018.
 */
public class Restaurant {
    private double rent;
    private double budget;
    private Storage storage;
    List<Employee> employees;
    List<Table> tables;
    List<Menu> menus;

    public Restaurant() {
        employees = new ArrayList<>();
        tables = new ArrayList<>();
        menus = new ArrayList<>();
    }

    public Restaurant(double rent, double budget) {
        this.rent = rent;
        this.budget = budget;
        this.storage = null;
        employees = new ArrayList<>();
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public String fireEmployee(Employee employee) {
        employees.remove(employee);
        return employee.getName();
    }

    public boolean checkingEnoughBudget(double budget) {
        return this.budget > budget;
    }

    public void addingMenu(Menu menu) {
        this.menus.add(menu);
    }

    public boolean checkingStorage(String material) {
        return false;
    }

    public void printEmployees() {
        System.out.println("\n- - - - - - Employees - - - - - - ");
        System.out.println("Position\tName-Surname\tSalary");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString() + "\t\t" + employees.get(i).getName() +
                    " " + employees.get(i).getSurname() + "\t\t" + employees.get(i).calculateSalary());

        }
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
