package units;
/**
 * Разбойник
 * */
public class RobberUnit extends BaseUnit {
    public RobberUnit(String name) {
        super(12, 4, 3, new int[]{-1, -3}, name);
    }

    public void Evil(){}

    @Override
    public void step() {

    }
    @Override
    public String getInfo() {
        return "Разбойник " + name;
    }
}
