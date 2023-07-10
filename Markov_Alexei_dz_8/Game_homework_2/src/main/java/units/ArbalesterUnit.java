package units;

import java.util.ArrayList;

/**
 * Арбалетчик
  */

public class ArbalesterUnit extends BaseUnit {
    public ArbalesterUnit(String name, int x, int y) {
        super(12, 4, 3, new int[]{-1, -3}, name, x, y);
    }

    public void fire(){}

    @Override
    public void step(ArrayList<BaseUnit> units) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
