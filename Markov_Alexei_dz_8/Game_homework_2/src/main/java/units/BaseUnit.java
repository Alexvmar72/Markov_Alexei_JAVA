package units;

/**
 * Основной класс юнитов
 * */
public abstract class BaseUnit implements InGameInterface {
    String name;
    public float hp;
    public float maxHp;
    int attac;
    int defend;
    int[] damage;

    public BaseUnit(float maxHp, int attac, int defend, int[] damage, String name) {
        this.name = name;
        this.maxHp = this.hp = maxHp;
        this.attac = attac;
        this.damage = damage;
        this.defend = defend;
    }


    public void getDamage(float damage){
        hp -= damage;
    }

    @Override
    public String getInfo() {
        return name;
    }
}
