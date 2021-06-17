package com.company.javarush08;

//    1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
//    2. String date передается в формате FEBRUARY 1 2013
//    Не забудь учесть первый день года.
//
//    Пример:
//    JANUARY 1 2000 = true
//    JANUARY 2 2020 = false
//
//    Требования:
//    •	Программа должна выводить текст на экран.
//    •	Класс Solution должен содержать два метода.
//    •	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
//    •	Метод main() должен вызывать метод isDateOdd().

import java.util.Date;

public class Solution27 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }
}
