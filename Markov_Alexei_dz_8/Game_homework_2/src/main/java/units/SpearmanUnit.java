package units;
/**
 * Копейщик */
public class SpearmanUnit extends BaseUnit {
    public SpearmanUnit(String name){
        super(12, 4, 3, new int[]{-1, -3}, name);
    }
    public void Accuracy(){}

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Копейщик " + name;
    }
}
