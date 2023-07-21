package units;

import java.util.ArrayList;

/**
 * Арбалетчик
  */

public class ArbalesterUnit extends BaseUnit {
    public int arrays;
    public ArbalesterUnit(String name, int x, int y) {
        super(12, 4, 3, new int[]{-1, -3}, name, x, y);
    }


    public void fire(){}

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
        return "Арбалетчик " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
