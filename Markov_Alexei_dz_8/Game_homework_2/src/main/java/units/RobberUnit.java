package units;

import java.util.ArrayList;

/**
 * Разбойник
 * */
public class RobberUnit extends BaseUnit {
    public RobberUnit(String name, int x, int y) {
        super(12, 4, 3, -1, name, x, y);
    }

    public void Evil(){}

    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }
    @Override
    public String getInfo() {
        return "Разбойник " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
