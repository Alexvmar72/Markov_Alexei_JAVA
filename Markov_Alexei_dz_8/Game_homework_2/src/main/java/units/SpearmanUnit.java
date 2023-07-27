package units;

import java.util.ArrayList;

/**
 * Копейщик */
public class SpearmanUnit extends BaseUnit {

    protected int attacLevel, attac;
    public SpearmanUnit(String name, int x, int y, int speed){
        super(12, 1, speed + 4,  true, name, x, y, "ready", 1);
        this.attacLevel = 100;
        this.attac = 100;
    }


    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        if (!isAlive) return;
        BaseUnit tmp = nearest(units2);
        if (coordinates.countDistanse(tmp.coordinates) <= attac) {
            for (int i = 0; i < attacLevel; i++) {
                tmp.getDamage(damage);
            }
            state = "Attack";
        } else {
            move(tmp.coordinates, units);
            state = "Moving";
        }

    }

    @Override
    public String getInfo() {
        return "Копейщик " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
