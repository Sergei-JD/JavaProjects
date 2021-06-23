package com.company.javarush09;

//    Написать пять методов, которые вызывают друг друга.
//    Метод должен вернуть номер строки кода, из которого вызвали этот метод.
//    Воспользуйся функцией: element.getLineNumber().
//
//    Требования:
//    •	В классе должно быть 5 методов (метод main не учитывать).
//    •	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//    •	Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
//    •	Для получения номера строки, используй метод getLineNumber класса StackTraceElement.

public class Solution03 {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
