package src;

import java.util.ArrayList;

/**
 * Created by Ezgi on 17.04.2018.
 */
public class Material {
    private String type;
    private double amountofMaterial;
    private String seasons;

    public Material() {

    }

    public Material(String type, String seasons) {
        this.type = type;
        this.amountofMaterial = 1;
        this.seasons = seasons;
    }

    public boolean checkingSeason(String seasons) {
        return this.seasons.equals(seasons);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmountofMaterial() {
        return amountofMaterial;
    }

    public void setAmountofMaterial(double amountofMaterial) {
        this.amountofMaterial = amountofMaterial;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }


}