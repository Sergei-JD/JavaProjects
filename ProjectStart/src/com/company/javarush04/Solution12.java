package com.company.javarush04;

//      Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
//        "четное однозначное число" - если число четное и имеет одну цифру,
//        "нечетное однозначное число" - если число нечетное и имеет одну цифру,
//        "четное двузначное число" - если число четное и имеет две цифры,
//        "нечетное двузначное число" - если число нечетное и имеет две цифры,
//        "четное трехзначное число" - если число четное и имеет три цифры,
//        "нечетное трехзначное число" - если число нечетное и имеет три цифры.
//        Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        boolean a1 = num > 0 && num < 10;
        boolean a2 = num >= 10 && num < 100;
        boolean a3 = num >= 100 && num < 1000;
        boolean even = num % 2 == 0;

        if (a1) {
            if (even)
                System.out.println("четное однозначное число");
            else
                System.out.println("нечетное однозначное число");
        } else if (a2) {
            if (even)
                System.out.println("четное двухзначное число");
            else
                System.out.println("нечетное двухзначное число");
        } else if (a3) {
            if (even)
                System.out.println("четное трехзначное число");
            else
                System.out.println("нечетное трехзначное число");
        }
    }
}
