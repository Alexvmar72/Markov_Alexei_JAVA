package units;

import java.util.ArrayList;

/**
 * Снайпер
 * */
public class SharpshooterUnit extends BaseUnit {
    public SharpshooterUnit(String name, int x, int y) {
        super(12, 5, 2, new int[]{-1, -3}, name, x, y);
    }

    public void Accuracy(){}

    @Override
    public void step(ArrayList<BaseUnit> units) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }

    @Override
    public String getInfo() {
        return "Снайпер " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
