package units;

import java.util.ArrayList;

/**
 * Крестьянин
 * */
public class CountrymanUnit extends BaseUnit {
    public CountrymanUnit(String name, int x, int y){
        super(12, 1, 1, -1, name, x, y);
    }

    public void benefit(){}

//    @Override
//    public void step() {
//
//    }

    @Override
    public String getInfo() {
        return "Крестьянин " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }

    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }
}
