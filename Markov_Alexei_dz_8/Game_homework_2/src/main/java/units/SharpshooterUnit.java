package units;

import java.util.ArrayList;

/**
 * Снайпер
 * */
public class SharpshooterUnit extends BaseUnit {

    public int arrays;
    public SharpshooterUnit(String name, int x, int y) {
        super(12, 5, 2, -1, 2, true, name, x, y, "ready");
    }

    public void Accuracy(){}

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

        for (BaseUnit unit: units2) {
            if (unit instanceof CountrymanUnit && unit.state == "ready") {
                arrays += 1;
                unit.state = "buse";
                System.out.println(getInfo() + " принёс стрелу для " + unit.getInfo());
                return;
            }
        }
    }

    @Override
    public String getInfo() {

        return "Снайпер " + super.getInfo() + " имеет стрел: " + arrays;
    }
}
