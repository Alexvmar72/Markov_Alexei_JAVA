package units;

import java.util.ArrayList;

/**
 * Крестьянин
 * */
public class CountrymanUnit extends BaseUnit {
    protected int attac, actionPriority;
    public CountrymanUnit(String name, int x, int y){
        super(12, 1, 1, true, name, x, y, "ready", 1);
        this.attac = attac;
        this.actionPriority = actionPriority;
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }

    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        BaseUnit tmp = nearest(units2);
        if (isAlive) {
            if (state == "Busy") {
                state = "Stand";
            }
        } else return;

        if ((int) coordinates.countDistanse(tmp.coordinates) <= attac) {
            tmp.getDamage(damage);
            state = "Attack";
        } else {
            move(tmp.coordinates, units);
            state = "Moving";
        }
    }
}
