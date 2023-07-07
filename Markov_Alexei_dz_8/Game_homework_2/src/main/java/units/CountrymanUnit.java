package units;
/**
 * Крестьянин
 * */
public class CountrymanUnit extends BaseUnit {
    public CountrymanUnit(String name){
        super(12, 1, 1, new int[]{-1, -3}, name);
    }

    public void benefit(){}

    @Override
    public void step() {

    }
}
