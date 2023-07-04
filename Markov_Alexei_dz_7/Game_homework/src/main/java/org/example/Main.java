package org.example;
// Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному
// экземпляру каждого класса.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MonkUnit unit1 = new MonkUnit();
        RobberUnit unit2 = new RobberUnit();
        SpearmanUnit unit3 = new SpearmanUnit();
        SharpshooterUnit unit4 = new SharpshooterUnit();
        ArbalesterUnit unit5 = new ArbalesterUnit();
        CountrymanUnit unit6 = new CountrymanUnit();
        MagicianUnit unit7 = new MagicianUnit();
;


    }
}