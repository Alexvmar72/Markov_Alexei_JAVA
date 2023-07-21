package units;

import java.util.ArrayList;

/**
 * Снайпер
 * */
public class SharpshooterUnit extends BaseUnit {

    public int arrays;
    public SharpshooterUnit(String name, int x, int y) {
        super(12, 5, 2, new int[]{-1, -3}, name, x, y);
    }

    public void Accuracy(){}

    @Override
    public void step(ArrayList<BaseUnit> units) {
        if (hp == 0 || arrays == 0) {
            return;
        }
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name);
    }

    @Override
    public String getInfo() {
        return "Снайпер " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
