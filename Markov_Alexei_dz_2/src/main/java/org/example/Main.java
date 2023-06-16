package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        String query_string = "select * from students where";
        String sql_str = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        String[] list = sql_str.replace("\"", "").replace(":", "=").split(",");

        StringBuilder resultSelect = new StringBuilder();
        resultSelect.append(" ").append(list[0]).append(",").append(list[1]).append(",").append(list[2]).append(",").append(list[3]);
        String result_str = resultSelect.toString();
        query_string.concat(result_str);
        System.out.println(query_string.concat(result_str));
    }

}
