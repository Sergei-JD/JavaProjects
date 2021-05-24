package com.company.javarush04;

//    Вводить с клавиатуры числа.
//        Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//        -1 должно учитываться в сумме.
//
//        Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//            while (true) {
//            int number = считываем число;
//            if (проверяем, что number -1)
//            break;
//            }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum =0;

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            sum += n;
            if (n == -1)
                break;
        }
        System.out.println(sum);
    }
}
