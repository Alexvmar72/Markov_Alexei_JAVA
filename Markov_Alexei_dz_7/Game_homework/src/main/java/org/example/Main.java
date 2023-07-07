package org.example;
// Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному
// экземпляру каждого класса.


public class Main {
    public static void main(String[] args) {
        MonkUnit monk = new MonkUnit("Петя");
        RobberUnit robber = new RobberUnit("Вася");
        SpearmanUnit spearman = new SpearmanUnit("Федя");
        SharpshooterUnit sharpshooter = new SharpshooterUnit("Боря");
        ArbalesterUnit arbalester = new ArbalesterUnit("Миша");
        CountrymanUnit countryman = new CountrymanUnit("Саша");
        MagicianUnit magician = new MagicianUnit("Паша");
        System.out.println(magician.getInfo());

    }

}