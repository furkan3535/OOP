package src;

/**
 * Created by Furkan on 18.04.2018.
 */
public class Boss extends Employee {

    private String possition;

    public Boss(String name, String surname, int age, String address, int phoneNumber, String restDay, double salary) {
        super(name, surname, age, address, phoneNumber, restDay, salary);
        possition = null;
    }

    public boolean checkingBudget(Restaurant rst, double costOfProduct) {
        return rst.getBudget() >= costOfProduct;
    }

    public boolean checkingSupply(Restaurant rst, String product) {
        return rst.checkingStorage(product);
    }

    public boolean givingOrder(Restaurant rst, Supply supply) {
        if (!checkingSupply(rst, supply.getName()))
            if (checkingBudget(rst, supply.getPrice())) {
                rst.getStorage().purchaseSupply(supply);
                return true;
            }
        return false;
    }

    public void setPosition() {
        this.possition = "boss";
    }

    public Boss(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    public String toString() {
        return "Boss   ";
    }
}
