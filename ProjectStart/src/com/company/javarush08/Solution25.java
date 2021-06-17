package com.company.javarush08;

//    Написать программу, которая вводит с клавиатуры строку текста.
//    Программа заменяет в тексте первые буквы всех слов на заглавные.
//    Вывести результат на экран.
//
//    Пример ввода:
//    мама мыла раму.
//
//    Пример вывода:
//    Мама Мыла Раму.
//
//    Требования:
//    •	Программа должна выводить текст на экран.
//    •	Программа должна считывать строку с клавиатуры.
//    •	Программа должна заменять в тексте первые буквы всех слов на заглавные.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String upper_case_line = "";

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            upper_case_line += character;
        }
        System.out.println(upper_case_line);

//        при помощи сканера
//        Scanner lineScan = new Scanner(string);
//        while (lineScan.hasNext()) {
//            String word = lineScan.next();
//            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
//        }
//        System.out.println(upper_case_line);


    }
}
