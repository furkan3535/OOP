package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Furkan on 18.04.2018.
 */
public class Storage {
    private List<Supply> supplies;
    private int dimension;
    private String status;

    public Storage(List<Supply> supplies, int dimension, String status) {
        this.supplies = supplies;
        this.dimension = dimension;
        this.status = status;
    }

    public boolean settingStoreCondition(String condition) {
        return status.equals(condition);
    }

    public void purchaseSupply(Supply supply) {
        supplies.add(supply);
    }

    public List<Supply> getSupplies() {

        return supplies;
    }

    public void printStorage() {
        System.out.println("- - - - - Storage - - - - - -\nName\tType\tAmount\tPrice");
        for (int i = 0; i < supplies.size(); i++) {
            Supply supplyToPrint = supplies.get(i);
            System.out.println(supplyToPrint.getName() + "\t" + supplyToPrint.getType() + "\t" +
                    supplyToPrint.getAmount() + "\t\t" + supplyToPrint.getPrice() + "₺");
        }
    }

    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}