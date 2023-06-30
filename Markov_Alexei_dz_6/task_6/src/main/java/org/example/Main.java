package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SetEmulation setEmulation = new SetEmulation();
        System.out.println(setEmulation.add(9));
        System.out.println(setEmulation.add(7));
        System.out.println(setEmulation.add(11));
    }
}
class SetEmulation<E>{
    private HashMap<E, Object> list = new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(E new_num){
        return list.put(new_num, OBJECT) == null;
    }
}