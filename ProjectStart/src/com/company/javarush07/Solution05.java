package com.company.javarush07;

//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
//
//        Требования:
//        •	Программа должна создавать большой массив на 20 целых чисел.
//        •	Программа должна считывать с клавиатуры 20 чисел для большого массива.
//        •	Программа должна создавать два маленьких массива на 10 чисел каждый.
//        •	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] arrayN = new int[20];
        int [] arrayN1 = new int[10];
        int [] arrayN2 = new int[10];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = Integer.parseInt(reader.readLine());
        }

//        заполнение маленьких массивов при помощи циклов
        for (int i = 0; i < arrayN1.length; i++) {
            arrayN1[i] = arrayN[i];
            arrayN2[i] = arrayN[i + 10];
            System.out.println(arrayN2[i]);
        }
//        заполнение маленьких массивов при помощи методов класса Arrays и вывод массива в строку
//        arrayN1 = Arrays.copyOfRange(arrayN, 0, 3);
//        arrayN2 = Arrays.copyOfRange(arrayN, 3, 6);
//        System.out.println(Arrays.toString(arrayN2));
    }
}
