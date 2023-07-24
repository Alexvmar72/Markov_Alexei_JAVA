package units;

import java.util.ArrayList;

/**
 * Монах
 * */
public class MonkUnit extends units.BaseUnit {
    public MonkUnit(String name, int x, int y){
        super(12, 4, 3, -1, 2, true, name, x, y, "ready", 1);
    }
    public void castMana(){}


    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }

    @Override
    public String getInfo() {
        return "Монах " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }


}
