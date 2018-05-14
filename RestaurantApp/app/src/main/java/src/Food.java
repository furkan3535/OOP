package src;

import java.util.ArrayList;

/**
 * Created by Ezgi on 18.04.2018.
 */
public interface Food {

    void addingMaterial(Material material);

    void specialOrder(Material m1, Object meal);


    void setPrice(double price);

    double getPrice();
}
