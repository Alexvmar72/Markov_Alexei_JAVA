package units;

import java.util.ArrayList;

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
    Coordinates coordinates;

    public BaseUnit(float maxHp, int attac, int defend, int[] damage, String name, int x, int y) {
        this.name = name;
        this.maxHp = this.hp = maxHp;
        this.attac = attac;
        this.damage = damage;
        this.defend = defend;
        coordinates = new Coordinates(x, y);
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s x: %d y: %d", name, coordinates.x, coordinates.y);
    }

    public BaseUnit nearest(ArrayList<BaseUnit> units) {
        double nearestDistanse = Double.MAX_VALUE;
        BaseUnit nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if(coordinates.countDistanse(units.get(i).coordinates) < nearestDistanse) {
                nearestEnemy = units.get(i);
                nearestDistanse = coordinates.countDistanse(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
   }

   @Override
    public void step(ArrayList<BaseUnit> units){

   }
}
