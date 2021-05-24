package com.company.javarush04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите, пожалуйста, Ваше имя...");
        String name = reader.readLine();
        System.out.println("Введите день Вашего рождения числом...");
        int day = Integer.parseInt(reader.readLine());
        System.out.println("Введите месяц Вашего рождения числом...");
        int month = Integer.parseInt(reader.readLine());
        System.out.println("Введите год Вашего рождения...");
        int year = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".\n"  + "Я родился " + day + "." + month + "." + year );
    }
}
