package org.example;

import units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<BaseUnit> team_red = new ArrayList<>();
    public static ArrayList<BaseUnit> team_green = new ArrayList<>();
    public static ArrayList<BaseUnit> teamAll = new ArrayList<>();
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        System.out.println();
        System.out.println("Команда красных: ");
        for (int i = 0; i <= teamCount; i++) {
            int val_r = rand.nextInt(4);
            switch (val_r) {
                case 0:
                    team_red.add(new MagicianUnit(getName(), 1, i));
                    break;
                case 1:
                    team_red.add(new RobberUnit(getName(), 1, i));
                    break;
                case 2:
                    team_red.add(new CountrymanUnit(getName(), 1, i));
                    break;
                case 3:
                    team_red.add(new SharpshooterUnit(getName(), 1, i));
                    break;
            }
            System.out.println(team_red.get(i).getInfo());
        }
        System.out.println();
        System.out.println("Команда зелёных: ");
        for (int j = 0; j <= teamCount; j++) {
            int val_g = rand.nextInt(4);
            switch (val_g) {
                case 0:
                    team_green.add(new MonkUnit(getName(), 10, j));
                    break;
                case 1:
                    team_green.add(new ArbalesterUnit(getName(), 10, j));
                    break;
                case 2:
                    team_green.add(new CountrymanUnit(getName(), 10, j));
                    break;
                case 3:
                    team_green.add(new SpearmanUnit(getName(), 10, j));
                    break;
            }
            System.out.println(team_green.get(j).getInfo());
        }
        teamAll.addAll(team_green);
        teamAll.addAll(team_red);
        teamAll.sort(BaseUnit::compareTo);

        Scanner in = new Scanner(System.in);
        while (true){
            View.view();
            in.nextLine();
            for (BaseUnit unit : teamAll){
                if (team_green.contains(unit)){
                    unit.step(team_green, team_red);
                }else unit.step(team_red, team_green);
            }
            if (isTeamDie(team_green)){
                System.out.println("Команда красных выиграла");
                break;
            }
            if (isTeamDie(team_red)){
                System.out.println("Команда зелёных выиграла");
                break;
            }
        }
    }

    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }
    static boolean isTeamDie(ArrayList<BaseUnit> team){
        for (BaseUnit unit: team){
            if (!unit.die()) return false;
        } return true;
    }
}