package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

    public static List<String> Array_Users(Scanner scanner) {
        List<String> all_users = new ArrayList<>();

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
                    .append("[")
                    .append(name)
                    .append("][")
                    .append(age)
                    .append("][")
                    .append(sex + "]");

            all_users.add(String.valueOf(resultUser));
            System.out.print("Для ввода нового пользователя введите д: ");
            String run_next = scanner.nextLine();
            if (!Objects.equals(run_next, "д")) {
                run = false;
            }
        }

        return all_users;
    }
    public static void SaveInFile(List<String> array_save) throws Exception {
        FileWriter fileWriter = new FileWriter("user.txt", true);
        fileWriter.write(array_save.toString());
        fileWriter.append('\n');
        fileWriter.close();

    }

    public static void ReadFile() throws Exception {
        File file_txt = new File("user.txt");
        BufferedReader br = new BufferedReader(new FileReader(file_txt));
        String line;

        while ((line = br.readLine()) != null) {
            String[] array = line
                    .replace("[[", "")
                    .replace("]]", "")
                    .replace("][", ",")
                    .split("], \\[");

            for (int i = 0; i < array.length; i++) {
                String[] list = array[i]
                        .replace("\"", "")
                        .split(",");

                StringBuilder resultSelect = new StringBuilder();
                resultSelect
                        .append("ФИО: ")
                        .append(list[0])
                        .append(" возраст: ")
                        .append(list[1])
                        .append(" пол: ")
                        .append(list[2]);

                System.out.println(resultSelect);
            }
        }
    }
    public static int CountSizeArray() throws Exception {
        File file_txt = new File("user.txt");
        BufferedReader br = new BufferedReader(new FileReader(file_txt));
        int count = 0;
        String countUser;

        while ((countUser = br.readLine()) != null ) {
            String[] array = countUser
                    .split(",");
            count+= array.length;
        }
        return count;
    }
    public static void CreateSortArray(int sizeArray, int sortIndex) throws Exception {
        File file_txt = new File("user.txt");
        BufferedReader br = new BufferedReader(new FileReader(file_txt));
        String line;
        String[][] BuildArray = new String[sizeArray][3];
        int n = 0;
        while ((line = br.readLine()) != null) {
            String[] array = line
                    .replace("[[", "")
                    .replace("]]", "")
                    .replace("][", ",")
                    .split("], \\[");
            //System.out.println(array);

            for (int i = 0; i < array.length; i++) {
                //System.out.println(array[i]);
                String[] list = array[i]
                        .replace("\"", "")
                        .split(",");
                BuildArray[n] = list;
                n++;
            }
        }
        System.out.println();
        System.out.println("Отсортированный список:");
        Arrays.sort(BuildArray, Comparator.comparing(o -> o[sortIndex]));
        for (int i = 0; i < BuildArray.length; i++)
        {
            System.out.print("ФИО: " + BuildArray[i][0] + ", возраст: " + BuildArray[i][1] + ", пол: " + BuildArray[i][2]);
            System.out.println();
        }

        //System.out.println(Arrays.deepToString(BuildArray));
    }

    public static void Command(Scanner scanner) throws Exception {
        String startMenu = "Добрый день! Программа создания списка пользователей\n" +
                "Для работы программы выберите:\n" +
                "1 - Записать нового пользователя\n" +
                "2 - Вывод списка пользователей\n" +
                "3 - Сортировка списка пользователей по имени\n" +
                "4 - Сортировка списка пользователей по году\n" +
                "5 - Сортировка списка пользователей по полу\n";

        System.out.println(startMenu);
        String run_command = scanner.nextLine();
        if (!Objects.equals(run_command, "1")
                && !Objects.equals(run_command, "2")
                && !Objects.equals(run_command, "3")
                && !Objects.equals(run_command, "4")
                && !Objects.equals(run_command, "5")

        ){
            System.out.println("Введите команду из меню\n");

        } else {
            switch (run_command) {
                case "1":
                    SaveInFile(Array_Users(scanner));
                    break;
                case "2":
                    ReadFile();
                    break;
                case "3":
                    CreateSortArray(CountSizeArray(), 0);
                case "4":
                    CreateSortArray(CountSizeArray(), 1);
                case "5":
                    CreateSortArray(CountSizeArray(), 2);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Command(scanner);
        scanner.close();
    }
}
