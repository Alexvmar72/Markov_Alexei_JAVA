package units;
/**
 * Монах
 * */
public class MonkUnit extends BaseUnit{
    public MonkUnit(String name){
        super(12, 4, 3, new int[]{-1, -3}, name);
    }
    public void castMana(){}

    @Override
    public void getDamage(float damage){
        hp -= damage;
        if (hp>=maxHp) hp = maxHp;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Монах " + name;
    }


}
