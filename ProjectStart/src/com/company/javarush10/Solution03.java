package com.company.javarush10;

//    Добавь одну операцию по преобразованию типа, чтобы получился ответ: b = 0.
//    float f = (float)128.50;
//    int i = (int)f;
//    int b = (int)(i + f);
//
//    Требования:
//    •	Программа должна выводить текст на экран.
//    •	Нельзя менять команду вывода на экран.
//    •	Метод main() должен содержать переменную f типа float.
//    •	Метод main() должен содержать переменную i типа int.
//    •	Метод main() должен содержать переменную b типа int.
//    •	Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
//    •	Программа должна выводить число 0.

/*
Задача №3 на преобразование целых типов
*/

public class Solution03 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte)(i + f));
        System.out.println(b);
    }
}