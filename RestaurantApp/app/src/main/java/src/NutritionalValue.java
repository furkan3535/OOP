package src;

/**
 * Created by Ezgi on 30.04.2018.
 */
public class NutritionalValue {
    private double fat;
    private double protein;
    private double carbonhydrates;

    public NutritionalValue(double fat, double protein, double carbonhydrates) {
        this.fat = fat;
        this.protein = protein;
        this.carbonhydrates = carbonhydrates;
    }

    public double calculatingCalories() {
        return this.fat + this.protein + this.carbonhydrates;
    }
    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbonhydrates() {
        return carbonhydrates;
    }

    public void setCarbonhydrates(double carbonhydrates) {
        this.carbonhydrates = carbonhydrates;
    }


}
