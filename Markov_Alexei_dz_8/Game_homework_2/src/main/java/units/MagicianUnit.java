package units;

import java.util.ArrayList;

/**
 * Маг, волшебник
 * */
public class MagicianUnit extends BaseUnit {
    private int mana;
    private int maxMana;

    public MagicianUnit(String name, int x, int y) {
        super(12, 4, 3, -1, name, x, y);
        this.maxMana = this.mana = maxMana;
    }

    @Override
    public void step(ArrayList<BaseUnit> units) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }

    @Override
    public String getInfo() {
        return "Маг " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
