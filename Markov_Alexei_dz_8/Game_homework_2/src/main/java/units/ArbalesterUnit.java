package units;

import java.util.ArrayList;

/**
 * Арбалетчик
  */

public class ArbalesterUnit extends BaseUnit {
    public int arrays;
    public ArbalesterUnit(String name, int x, int y) {
        super(12, 4, 3, -1, name, x, y);
    }


    public void fire(){}

    @Override
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2) {
        if (hp == 0 || arrays == 0) {
            return;
        }
        BaseUnit tmp = nearest(units);
        System.out.println("Ближайший враг - "+ tmp.name);
        doAttack(tmp);
        if (units2.contains(CountrymanUnit.class)){
            return;

        }
        arrays --;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + super.getInfo() + "имеет стрел: " + arrays;
    }
}
