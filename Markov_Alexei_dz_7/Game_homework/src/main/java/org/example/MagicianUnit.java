package org.example;

public class MagicianUnit extends BaseUnit {
    private int mana;
    private int maxMana;

    public MagicianUnit() {
        super(String.format("Hero_Magician #%d", ++MagicianUnit.number),
                MagicianUnit.r.nextInt(100, 200));
        this.maxMana = MagicianUnit.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
