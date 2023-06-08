package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int RandomNum(int max) {
        int num = new Random().nextInt(max);
        return num;
    }

    public static int MostSignificantBit(int num) {
        int binary_len = Integer.toBinaryString(num).length();
        return binary_len;
    }

    public static int[] ListMax(int num_i, int num_n, int max_lev) {
        int count = 0;

        //Вычисляем размер будущего массива m1
        for (int j = num_i; j < max_lev; j++) {
            if (j % num_n == 0) {
                count++;
            }
        }

        //Формируем массив m1, и заносим в него удовлетворяющие условию значения
        int[] array_max = new int[count];
        for (int r = num_i, f = 0; r < max_lev; r++) {
            if (r % num_n == 0) {
                array_max[f] = r;
                f++;
            }
        }
        return array_max;
    }

    public static int[] ListMin(int num_i, int num_n, int min_lev) {
        int count_min = 0;
        for (int j = min_lev; j < num_i; j++) {
            if (j % num_n == 0) {
                count_min++;
            }
        }

        //Формируем массив m2, и заносим в него удовлетворяющие условию значения
        int[] array_min = new int[count_min];
        for (int r = min_lev, f = 0; r < num_i; r++) {
            if (r % num_n == 0) {
                array_min[f] = r;
                f++;
            }
        }
        return array_min;
    }


    public static void main(String[] args) {
        int i = RandomNum(2000);
        System.out.println("Выпало случайное число \"i\": " + i);

        int n = MostSignificantBit(i);
        System.out.println("Номер \"n\" старшего значащего бита числа " + i + ": " + n);

        int[] m1 = ListMax(i, n, Short.MAX_VALUE);
        System.out.println(Arrays.toString(m1));

        int[] m2 = ListMin(i, n, Short.MIN_VALUE);
        System.out.println(Arrays.toString(m2));


    }
}