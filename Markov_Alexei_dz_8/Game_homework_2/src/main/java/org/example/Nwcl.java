package org.example;

import java.util.ArrayList;

public class Nwcl {
    public static void main(String[] args) {
        NewCls<ArrayList> cls = new NewCls();
        System.out.println(cls.getName(new ArrayList<>()));
    }
}
