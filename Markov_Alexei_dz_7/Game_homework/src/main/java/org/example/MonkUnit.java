package org.example;
/**
 * Монах
 * */
public class MonkUnit extends BaseUnit{
    public MonkUnit(){
        super(12, 4, 3, new int[]{-1, -3}, name);
    }
    public void castMana(){}

    @Override
    public void getDamage(float damage){
        hp -= damage;
        if (hp>=maxHp) hp = maxHp;
    }

}
