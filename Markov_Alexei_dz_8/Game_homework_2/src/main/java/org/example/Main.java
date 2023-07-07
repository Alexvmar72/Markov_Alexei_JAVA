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
            int val_r = rand.nextInt(7);
            switch (val_r) {
                case 0:
                    team_red.add(new MonkUnit(getName()));
                    break;
                case 1:
                    team_red.add(new MagicianUnit(getName()));
                    break;
                case 2:
                    team_red.add(new CountrymanUnit(getName()));
                    break;
                case 3:
                    team_red.add(new ArbalesterUnit(getName()));
                    break;
                case 4:
                    team_red.add(new RobberUnit(getName()));
                    break;
                case 5:
                    team_red.add(new SharpshooterUnit(getName()));
                    break;
                case 6:
                    team_red.add(new SpearmanUnit(getName()));
                    break;
                default:
                    break;
            }
            System.out.println(team_red.get(i).getInfo());
        }
            System.out.println();
            List<BaseUnit> team_green = new ArrayList<>();
            System.out.println("Команда зелёных: ");
            for (int j = 0; j < teamCount; j++) {
                int val_g = rand.nextInt(7);
                switch (val_g) {
                    case 0:
                        team_green.add(new MonkUnit(getName()));
                        break;
                    case 1:
                        team_green.add(new MagicianUnit(getName()));
                        break;
                    case 2:
                        team_green.add(new CountrymanUnit(getName()));
                        break;
                    case 3:
                        team_green.add(new ArbalesterUnit(getName()));
                        break;
                    case 4:
                        team_green.add(new RobberUnit(getName()));
                        break;
                    case 5:
                        team_green.add(new SharpshooterUnit(getName()));
                        break;
                    case 6:
                        team_green.add(new SpearmanUnit(getName()));
                        break;
                    default:
                        break;
                }
                System.out.println(team_green.get(j).getInfo());

            }
        }


    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }

}