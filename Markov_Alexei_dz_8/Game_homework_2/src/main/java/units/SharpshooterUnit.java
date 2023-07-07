package units;
/**
 * Снайпер
 * */
public class SharpshooterUnit extends BaseUnit {
    public SharpshooterUnit(String name) {
        super(12, 5, 2, new int[]{-1, -3}, name);
    }

    public void Accuracy(){}

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Снайпер " + name;
    }
}
