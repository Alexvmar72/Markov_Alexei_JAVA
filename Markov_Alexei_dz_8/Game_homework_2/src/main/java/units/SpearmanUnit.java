package units;

import java.util.ArrayList;

/**
 * Копейщик */
public class SpearmanUnit extends BaseUnit {
    public SpearmanUnit(String name, int x, int y){
        super(12, 4, 3, -1, name, x, y);
    }
    public void Accuracy(){}

    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        BaseUnit tmp = nearest(units);
        System.out.println(tmp.name + " " + coordinates.countDistanse(tmp.coordinates));
    }

    @Override
    public String getInfo() {
        return "Копейщик " + String.format("%s x: %d y: %d", name, coordinates.x, coordinates.y);
    }
}
