package com.company.javarush08;

//    1. Создай список чисел.
//    2. Добавь в список 10 чисел с клавиатуры.
//    3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
//    Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
//    3
//    Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
//
//    Требования:
//    •	Программа должна выводить число на экран.
//    •	Программа должна считывать значения с клавиатуры.
//    •	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
//    •	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
//    •	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String number = reader.readLine();
            list.add(Integer.parseInt(number));
        }
            int count = 1;
            int countMax = 1;
            for (int i = 0; i < list.size() - 1; i++) {
                if(list.get(i).equals(list.get(i + 1))) {
                    count++;
                    if(count > countMax)
                        countMax = count;
                } else count = 1;
            }
        System.out.println(countMax);
    }
}
