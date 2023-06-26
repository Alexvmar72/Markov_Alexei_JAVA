package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        CreatedAbonent(map, "Алексей", "234");
        CreatedAbonent(map, "Владимир", "345");
        CreatedAbonent(map, "Илья", "456");
        CreatedAbonent(map, "Светлана", "567");
        CreatedAbonent(map, "Анна", "678");
        CreatedAbonent(map, "Дарья", "789");
        CreatedAbonent(map, "Владимир", "123");
        System.out.println(map);

        ArrayList<String> list_sort = new ArrayList<>();
        for (String elem_sort: map.keySet()
             ) {
            list_sort.add(elem_sort);
        }
        Collections.sort(list_sort, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).size() - map.get(o2).size();
            }
        });
        System.out.println(list_sort);
    }
    private static void CreatedAbonent(HashMap<String, ArrayList<String>> map, String name, String phone) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);
    }
} 