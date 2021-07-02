package com.company.javarush12;

//    Напиши public static методы: int min(int, int), long min(long, long), double min(double, double).
//    Каждый метод должен возвращать минимальное из двух переданных в него чисел.
//
//    Требования:
//    •	Программа должна выводить текст на экран и имя метода.
//    •	Класс Solution должен содержать четыре метода.
//    •	Класс Solution должен содержать статический метод int min(int, int).
//    •	Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
//    •	Класс Solution должен содержать статический метод long min(long, long).
//    •	Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
//    •	Класс Solution должен содержать статический метод double min(double, double).
//    •	Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.
/*
Три метода и минимум
*/

public class Solution09 {
    public static void main(String[] args) {
        System.out.println(min(2_000_000, 2_000_001));
        System.out.println(min(2_000_000_000l, 2_000_000_001l));
        System.out.println(min(2, 2.1));
    }

    public static long min(long a, long b){
        System.out.println("метод long");
        return a < b ? a : b;
    }

    public static int min(int a, int b){
        System.out.println("метод int");
        return a < b ? a : b;
    }

    public static double min(double a, double b){
        System.out.println("метод double");
        return a < b ? a : b;
    }
}
