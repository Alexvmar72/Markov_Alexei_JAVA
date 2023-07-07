package units;
/**
 * Арбалетчик
  */

public class ArbalesterUnit extends BaseUnit {
    public ArbalesterUnit(String name) {
        super(12, 4, 3, new int[]{-1, -3}, name);
    }

    public void fire(){}

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name;
    }
}
