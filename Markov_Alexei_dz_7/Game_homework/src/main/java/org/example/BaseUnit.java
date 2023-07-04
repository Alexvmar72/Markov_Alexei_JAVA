package org.example;

import java.util.Random;

/**
 * Основной класс юнитов
 * */
public abstract class BaseUnit {
    String name;
    private float hp;
    private float maxHp;
    int attac;
    int defend;
    int[] damage;

    public BaseUnit(float maxHp, int attac, int defend, int[] damage, String name) {
        this.name = name;
        this.maxHp = maxHp;
        this.attac = attac;
        this.damage = damage;
        this.defend = defend;
    }

}
