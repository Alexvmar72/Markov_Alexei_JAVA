package org.example;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static List<String> Array_Users() {
        List<String> all_users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            StringBuilder resultUser = new StringBuilder();

            System.out.printf("Введите ФИО: ");
            String name = scanner.nextLine();
            System.out.printf("Введите возраст: ");
            String age = scanner.nextLine();
            System.out.printf("Введите пол: ");
            String sex = scanner.nextLine();
            resultUser
                    .append("{\"ФИО\":\"")
                    .append(name)
                    .append("\",\"Возраст\":\"")
                    .append(age)
                    .append("\",\"Пол\":\"")
                    .append(sex + "\"}" + "\n");

            all_users.add(String.valueOf(resultUser));
            System.out.print("Для ввода нового пользователя введите д: ");
            String run_next = scanner.nextLine();
            if (!Objects.equals(run_next, "д")) {
                run = false;
            }
        }
        scanner.close();
        return all_users;
    }
    public static void SaveInFile(List<String> array_save) throws Exception {
        FileWriter fileWriter = new FileWriter("user.txt", true);
        fileWriter.write(array_save.toString() + "\n");
        fileWriter.close();

    }

    public static void main(String[] args) throws Exception {
        SaveInFile(Array_Users());
    }
}
