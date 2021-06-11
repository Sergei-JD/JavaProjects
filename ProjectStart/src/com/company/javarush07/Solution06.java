package com.company.javarush07;

//    1. Создать массив на 15 целых чисел.
//    2. Ввести в него значения с клавиатуры.
//    3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
//    Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//    4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
//
//    Примечание:
//    дом с порядковым номером 0 считать четным.
//
//    Требования:
//    •	Программа должна создавать массив на 15 целых чисел.
//    •	Программа должна считывать числа для массива с клавиатуры.
//    •	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
//    •	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] house = new int[6];
        for (int i = 0; i < house.length; i++) {
            house[i] = Integer.parseInt(reader.readLine());
        }
        int evenSumHouse = 0;
        int oddSumHouse = 0;

//        for (int i = 0; i < house.length; i +=2) {
//            evenSumHouse += house[i];
//        }
//
//        for (int i = 1; i < house.length; i +=2) {
//            oddSumHouse += house[i];
//        }

        for (int i = 0; i < house.length; i++) {
            if (i % 2 == 0)
                oddSumHouse += house[i];
            else
                evenSumHouse += house[i];
        }

        System.out.println("В домах с четными номерами проживает: " + evenSumHouse + " жителей.");
        System.out.println("В домах с нечетными номерами проживает: " + oddSumHouse + " жителей.");

        if (evenSumHouse > oddSumHouse)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
