package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezgi on 17.04.2018.
 */
public class Meal extends Material implements Food {
    private String name;
    private String type;
    private double price;
    private List<Material> materials;
    private NutritionalValue calories;

    public Meal(String name, String type, double price, NutritionalValue calories) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.calories = calories;
        this.materials = new ArrayList<>();
    }

    public boolean checkingSeason(String seasons) {

        return seasons.equals(this.getSeasons());
    }

    public void addingMaterial(Material material) {
        materials.add(material);
    }

    public void specialOrder(Material m1, Object meal) {
        ((Meal) (meal)).addingMaterial(m1);
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