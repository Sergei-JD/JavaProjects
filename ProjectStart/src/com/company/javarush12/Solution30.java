package com.company.javarush12;

//    Добавь еще один метод, чтобы программа выводила на экран число 10.
//
//    Подсказка: используй перегрузку методов.
//
//    Требования:
//    Класс Solution должен содержать три метода.
//    Перегруженный метод transformValue должен удваивать переданное в него число.
//    Тип и значение переменной i менять нельзя.
//    Тип и значение переменной x менять нельзя.
//    Команду вывода на экран менять нельзя.
//    Метод main должен вызывать метод transformValue только один раз.
//    Программа должна вывести на экран число 10.
/*
Попадание в десятку
*/

public class Solution30 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static int transformValue(Integer i) {
        return i * 2;
    }
}
