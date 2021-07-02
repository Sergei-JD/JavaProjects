package com.company.javarush12;

//    Реализуй два метода: print(int) и print(Integer).
//    Напиши такой код в методе main(), чтобы вызвались оба.
//
//    Требования:
//    •	Класс Solution должен содержать статический метод main().
//    •	Класс Solution должен содержать статический void метод print() с параметром типа int.
//    •	Класс Solution должен содержать статический void метод print() с параметром типа Integer.
//    •	Метод main() должен вызывать метод print() с параметром типа int.
//    •	Метод main() должен вызывать метод print() с параметром типа Integer.
/*
Int и Integer
*/

public class Solution07 {
    public static void main(String[] args) {
        print(new Integer(10));
        print(5);
    }

    public static void print(int i){
        System.out.println("Метод int");
    }

    public static void print(Integer o){
        System.out.println("Метод Integer");
    }
}