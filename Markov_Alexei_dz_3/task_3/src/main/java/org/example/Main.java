package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static ArrayList<Integer> ListCreated(int num_count, int max_lev) {
        ArrayList<Integer> list_created = new ArrayList<>();
        for (int i = 0; i < max_lev ; i++) {
            list_created.add(new Random().nextInt(num_count));
        }
        return list_created;
    }
    public static ArrayList<Integer> ListOdd(ArrayList<Integer> list) {
        ArrayList<Integer> list_temp = new ArrayList<>();
        ArrayList<Integer> list_new = new ArrayList<>();
        list_temp.addAll(list);
        for (int i = 0; i < list_temp.size(); i++) {
            if (list_temp.get(i)%2 != 0) {
                list_new.add(list_temp.get(i));
            }
        }
        return list_new;
    }
    public static int ListMin(ArrayList<Integer> list) {
        ArrayList<Integer> list_n = new ArrayList<>();
        list_n.addAll(list);
        list_n.sort(Comparator.naturalOrder());
        return list_n.get(0);
    }
    public static int ListMax(ArrayList<Integer> list) {
        ArrayList<Integer> list_m = new ArrayList<>();
        list_m.addAll(list);
        list_m.sort(Comparator.reverseOrder());
        return list_m.get(0);
    }
    public static int ListMiddle(ArrayList<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum+=i;
        }
        int num_ret = sum/list.size();
        return num_ret;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list_base = ListCreated(100,15);
        ArrayList<Integer> list_odd = ListOdd(list_base);
        int min_num = ListMin(list_base);
        int max_num = ListMax(list_base);
        int middle_num = ListMiddle(list_base);
        System.out.println("Исходный список: " + list_base);
        System.out.println("Список без чётных чисел: " + list_odd);
        System.out.println("Минимальное значение: " + min_num);
        System.out.println("Максимальное значение: " + max_num);
        System.out.println("Среднее значение списка: " + middle_num);
    }
}