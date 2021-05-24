package com.company.javarush04;
// задание: Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
//"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
//если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int d = Integer.parseInt(str);
        if (d >= 1 && d <= 7) {
            if (d == 1)
                System.out.println("понедельник");
            else if (d == 2)
                System.out.println("вторник");
            else if (d == 3)
                System.out.println("среда");
            else if (d == 4)
                System.out.println("четверг");
            else if (d == 5)
                System.out.println("пятница");
            else if (d == 6)
                System.out.println("суббота");
            else
                System.out.println("воскресенье");
        }
        else
            System.out.println("такого дня недели не существует");
    }
}
