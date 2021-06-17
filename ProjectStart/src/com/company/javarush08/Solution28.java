package com.company.javarush08;

//    Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//    Используй коллекции.
//
//    Требования:
//    •	Программа должна считывать одно значение с клавиатуры.
//    •	Программа должна выводить текст на экран.
//    •	Программа должна использовать коллекции.
//    •	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        List<String> month = new ArrayList<String>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

//        for (int i = 0; i < 12; i++) {
//            if(str.equals(month.get(i))) {
//                System.out.println(str + " is the " + (i + 1) + " month");
//            }
//        }

        if (month.contains(str)) {
            int monthNumber = month.indexOf(str) + 1;
            System.out.println(str + " is the " + monthNumber + " month");
        } else {
            System.out.println(str + " isn't a month");
        }
    }
}
