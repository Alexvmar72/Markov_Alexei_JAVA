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

    public String getInfo() {
        return String.format("%s Магия: %d", super.getInfo(), this.mana);
    }

    @Override
    public void step() {

    }
}
