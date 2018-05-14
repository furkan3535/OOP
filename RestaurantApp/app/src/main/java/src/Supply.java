package src;

/**
 * Created by Furkan on 18.04.2018.
 */
public class Supply {
    private String name;
    private String type;
    private boolean status;
    private int amount;
    private double price;

    public Supply(String name, String type, boolean status, double price) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.amount = 1;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void increaseAmount() {
        this.amount++;
    }
}