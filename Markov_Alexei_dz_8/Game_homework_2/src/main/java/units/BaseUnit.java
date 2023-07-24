package units;

import javax.swing.plaf.nimbus.State;
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
    int damage;
    int speed;
    public boolean isAlive;
    //public String status = "Stand";
    Coordinates coordinates;
    String state;
    int moveDistance;

    public BaseUnit(float maxHp, int attac, int defend, int damage, int speed, boolean isAlive, String name, int x, int y, String state, int moveDistance) {
        this.name = name;
        this.maxHp = this.hp = maxHp;
        this.attac = attac;
        this.damage = damage;
        this.defend = defend;
        this.speed = speed;
        this.isAlive = isAlive;
        coordinates = new Coordinates(x, y);
        this.state = state;
        this.moveDistance = moveDistance;
    }

    public void doAttack(BaseUnit target){
        int damage = 1;
        target.getDamage(damage);
    }

    public void getDamage(int doneDamage){
        if (this.defend > 0){
            if (this.defend - doneDamage > 0)
                this.defend -= doneDamage;
            else {
                doneDamage -=this.defend;
                this.hp -= doneDamage;
                this.defend = 0;
            }
        }
        this.hp -= doneDamage;
        if (hp < 0){
            hp = 0;
            this.state = "die";
        }
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s x: %d y: %d", name, coordinates.x, coordinates.y);
    }

    /**
     * Поиск ближайшего врага
     */
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
    public void step(ArrayList<BaseUnit> units, ArrayList<BaseUnit> units2){
   }
   public String toString(){
        return this.getClass().getSimpleName();
   }
   public int compareTo(BaseUnit o) {
        return o.speed-this.speed;
   }

    public int[] getCoords() {
        return new int[] {coordinates.x, coordinates.y};
    }

    public void move(Coordinates targetPosition, ArrayList<BaseUnit> team) {
        if (!coordinates.containsByPos(coordinates.newPosition(targetPosition, team), team)) {
            for (int i = 0; i < moveDistance; i++) {
                coordinates = coordinates.newPosition(targetPosition, team);
            }
        }
    }
    public float getHp(){
        return hp;
    }

    public boolean die() {
        if (this.state == "die") {
            return true;
        }
        return false;
    }
}
