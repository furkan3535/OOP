package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 17.04.2018.
 */
public class Drink extends Material implements Food {
    private String type;
    private String name;
    private double price;
    private NutritionalValue calories;
    List<Material> materials;

    public Drink(String name, double price, String type, NutritionalValue calories) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.calories = calories;
        materials = new ArrayList<>();

    }
    public void specialOrder(Material m1, Object drink) {
        ((Drink)(drink)).addingMaterial(m1);
    }

    public Drink(ArrayList<Material> materials) {
        this.materials = materials;
    }

    public boolean checkingSeason(String seasons) {

        if (seasons.equals(this.getSeasons()))
            return true;
        else
            return false;
    }

    public void addingMaterial(Material material) {
        if (!materials.contains(material))
            materials.add(material);
        else {
            int a = materials.indexOf(material);
            materials.get(a).setAmountofMaterial(materials.get(a).getAmountofMaterial() + 1);
        }

    }

    public void addingMaterial(Material material, int count) {
        if (!materials.contains(material)) {
            material.setAmountofMaterial(count);
            materials.add(material);
        } else {
            int a = materials.indexOf(material);
            materials.get(a).setAmountofMaterial(materials.get(a).getAmountofMaterial() + count);
        }
    }

    public void specialOrder(String order) {
    }

    //----------------------GETTER-SETTER----------------
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public NutritionalValue getCalories() {
        return calories;
    }

    public void setCalories(NutritionalValue calories) {
        this.calories.calculatingCalories();
    }
}
