package org.example;

/**
 * Основной класс юнитов
 * */
public abstract class BaseUnit {
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

    public String getInfo(){
        return String.format("Имя: %s Здоровье: %d Тип объекта: %s", this.name, this.hp, this.getClass().getSimpleName());
    }

    public void getDamage(float damage){
        hp -= damage;
    }

}
