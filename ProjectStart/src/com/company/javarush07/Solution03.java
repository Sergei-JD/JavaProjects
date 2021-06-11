package com.company.javarush07;

//    1. Создать массив на 10 строк.
//    2. Создать массив на 10 чисел.
//    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//    4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//
//    Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
//
//    Требования:
//    •	Программа должна создавать массив на 10 строк.
//    •	Программа должна создавать массив на 10 целых чисел.
//    •	Программа должна считывать строки для массива с клавиатуры.
//    •	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] arrayStr = new String[10];
        int [] arrayNum = new int[10];

        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = reader.readLine();
        }

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = arrayStr[i].length();
            System.out.println(arrayNum[i]);
        }
    }
}
