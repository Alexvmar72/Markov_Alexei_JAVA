package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SetEmulation setEmulation = new SetEmulation();
        System.out.println(setEmulation.add(9));
        System.out.println(setEmulation.add(7));
        System.out.println(setEmulation.add(11));

        System.out.println(setEmulation.delete(6));
        System.out.println(setEmulation.isEmpty());
        System.out.println(setEmulation.contains(11));
        for (int i = 0; i < 10; i++) {
            setEmulation.add(new Random().nextInt(1000));
        }
        System.out.println("Размер мапы: " + setEmulation.size());
        Iterator<Integer> iterator = setEmulation.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(setEmulation.getElementByIndex(3));
        System.out.println(setEmulation.getElementByIndex(20));
    }
}
class SetEmulation<E>{
    private HashMap<E, Object> map = new HashMap<>();
    private static final Object OBJECT = new Object();
    public boolean add(E new_num){
        return map.put(new_num, OBJECT) == null;
    }
    public boolean delete(E new_num){
        return map.remove(new_num, OBJECT);
    }
    public int size(){
        return map.size();
    }
    public boolean isEmpty(){
        return map.isEmpty();
    }
    public boolean contains(Object new_num){
        return map.containsValue(new_num);
    }
    public Iterator<E> iterator(){
        return map.keySet().iterator();
    }
    public E getElementByIndex(int index){
        E[] mapArray = (E[]) map.keySet().toArray();
        return mapArray[index];
        }
}