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
    public List<Employee> employees;
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

    public String getEmployee(int i) {
        return employees.get(i).toString() + "\t\t" + employees.get(i).getName() +
                " " + employees.get(i).getSurname() + "\t\t" + employees.get(i).calculateSalary() + "\n";

    }

    public void fireEmployee(int i) {
        employees.remove(i);
    }

    public int checkEmployee(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().toLowerCase().equals(name.toLowerCase()) && employees.get(i).getSurname().toLowerCase().equals(surname.toLowerCase())) {
                return i;
            }
        }
        return -1;
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

    public String getEmployees() {
        String a = "";
        for (int i = 0; i < employees.size(); i++) {
            a += employees.get(i).toString() + "\t\t" + employees.get(i).getName() +
                    " " + employees.get(i).getSurname() + "\t\t" + employees.get(i).calculateSalary() + "\n";

        }
        return a;
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
