package src;

/**
 * Created by Furkan on 18.04.2018.
 */
public class ChefBarista extends Employee {

    private String possition;

    public ChefBarista(String name, String surname, int age, String address,
                       int phoneNumber, String restDay, double salary) {
        super(name, surname, age, address, phoneNumber, restDay, salary);
        possition = null;
    }

    public ChefBarista(String name, String surname, double salary) {

        super(name, surname, salary);
        possition = null;
    }

    public String toString() {
        return "Chef  ";
    }

    public void makingMeal() {
    }

    public void setPosition() {
        this.possition = "boss";
    }

    public void preparingDrink() {
    }

    public boolean checkingOrder() {
        return true;
    }
}
