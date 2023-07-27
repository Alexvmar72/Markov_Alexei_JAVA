package units;

import java.util.ArrayList;

/**
 * Монах
 * */
public class MonkUnit extends units.BaseUnit {
    protected int mana;
    public MonkUnit(String name, int x, int y, int speed){
        super(12, 1, speed,  true, name, x, y, "ready", 1);
        this.mana = 50;
    }

    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        BaseUnit tmpAlly = units.get(0);
        double minAllyHealth = 1;
        if (!isAlive) return;
        for (BaseUnit unit: units) {
            if (unit.hp / unit.maxHp < minAllyHealth && unit.isAlive) {
                minAllyHealth = unit.hp / unit.maxHp;
                tmpAlly = unit;
            }
        }
        if (minAllyHealth < 1 && mana > 0) {
            tmpAlly.getDamage(-damage);
            mana -= 1;
            state = "Healing";
            return;
        }
    }

    @Override
    public String getInfo() {
        return "Монах " + String.format("%s x: %d y: %d mana: %d", name, coordinates.x, coordinates.y, mana);
    }
}
