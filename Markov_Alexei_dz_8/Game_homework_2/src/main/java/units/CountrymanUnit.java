package units;

import java.util.ArrayList;

/**
 * Крестьянин
 * */
public class CountrymanUnit extends BaseUnit {
    public CountrymanUnit(String name, int x, int y){
        super(12, 1, 1, -1, 2, true, name, x, y, "ready", 1);
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }

    @Override

    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        if (isAlive) {state = "ready";} else return;
        BaseUnit tmp = nearest(units);
        if ((int) coordinates.countDistanse(tmp.coordinates) > attac) {
            move(tmp.coordinates, units);
            state = "Moving";
        }

    }
}
