package units;

import java.util.ArrayList;

/**
 * Арбалетчик
  */

public class ArbalesterUnit extends BaseUnit {
    public int arrays;
    public ArbalesterUnit(String name, int x, int y) {
        super(12, 4, 3, -1, 2, true, name, x, y, "ready");
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

        for (BaseUnit unit: units) {
            if (unit instanceof CountrymanUnit && unit.state == "ready") {
                arrays += 1;
                unit.state = "Buse";
                System.out.println(getInfo() + " принёс стрелу для " + unit.getInfo() + " Крестьянин " + unit.state);
                return;
            }
        }
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + super.getInfo() + " имеет стрел: " + arrays;
    }
}
