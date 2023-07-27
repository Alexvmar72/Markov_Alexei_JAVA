package units;

import java.util.ArrayList;

/**
 * Монах
 * */
public class MonkUnit extends units.BaseUnit {
    protected int mana, magicDamage, attac, actionPriority;
    public MonkUnit(String name, int x, int y){
        super(12, 4, 3,  true, name, x, y, "ready", 1);
        this.mana = 5;
        this.magicDamage = 4;
        this.attac = 1;
        this.actionPriority = 2;
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
            if (mana > 0) {
                tmp.getDamage(damage);
                mana -= 1;
                state = "Attack";
            } else {
                mana += 1;
                state = "Busy";
            }
        } else {
            move(tmp.coordinates, units);
            state = "Moving";
        }
    }

    @Override
    public String getInfo() {
        return "Монах " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
