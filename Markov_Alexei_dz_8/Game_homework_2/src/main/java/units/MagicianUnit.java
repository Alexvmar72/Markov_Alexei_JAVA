package units;
/**
 * Маг, волшебник
 * */
public class MagicianUnit extends BaseUnit {
    private int mana;
    private int maxMana;

    public MagicianUnit(String name) {
        super(12, 4, 3, new int[]{-1, -3}, name);
        this.maxMana = this.mana = maxMana;
    }

    @Override
    public void step() {
    }

    @Override
    public String getInfo() {
        return "Маг " + name;
    }
}
