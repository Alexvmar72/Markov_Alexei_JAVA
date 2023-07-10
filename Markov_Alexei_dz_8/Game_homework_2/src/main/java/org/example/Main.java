package org.example;

import units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();

        System.out.println();

        List<BaseUnit> team_red = new ArrayList<>();
        System.out.println("Команда красных: ");
        for (int i = 0; i < teamCount; i++) {
            int val_r = rand.nextInt(4);
            switch (val_r) {
                case 0:
                    team_red.add(new MagicianUnit(getName(), 2, 2));
                    break;
                case 1:
                    team_red.add(new RobberUnit(getName(), 1, 1));
                    break;
                case 2:
                    team_red.add(new CountrymanUnit(getName(), 1, 2));
                    break;
                case 3:
                    team_red.add(new SharpshooterUnit(getName(), 2, 1));
                    break;

            }
            System.out.println(team_red.get(i).getInfo());
        }
        System.out.println();
        List<BaseUnit> team_green = new ArrayList<>();
        System.out.println("Команда зелёных: ");
        for (int j = 0; j < teamCount; j++) {
            int val_g = rand.nextInt(4);
            switch (val_g) {
                case 0:
                    team_green.add(new MonkUnit(getName(), 10, 12));
                    break;
                case 1:
                    team_green.add(new ArbalesterUnit(getName(), 11, 16));
                    break;
                case 2:
                    team_green.add(new CountrymanUnit(getName(), 13, 15));
                    break;
                case 3:
                    team_green.add(new SpearmanUnit(getName(), 12, 14));
                    break;
            }
            System.out.println(team_green.get(j).getInfo());

        }
        System.out.println("Ближайший: ");
        team_red.forEach(n -> n.step((ArrayList<BaseUnit>) team_green));
    }


    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }
}