package src;

/**
 * Created by Furkan on 18.04.2018.
 */
public abstract class Employee extends Person {

    private String restDay;
    private double salary;

    public Employee(String name, String surname, int age, String address, int phoneNumber, String restDay, double salary) {
        super(name, surname, age, address, phoneNumber);

        this.restDay = restDay;
        this.salary = salary;
    }

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;


    }

    public String getRestDay() {
        return restDay;
    }

    public void setRestDay(String restDay) {
        this.restDay = restDay;
    }

    public double calculateSalary() {
        return salary * 12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void setPosition();


}
