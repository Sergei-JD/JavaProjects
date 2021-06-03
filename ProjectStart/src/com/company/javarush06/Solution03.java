package com.company.javarush06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution03 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        int c = Integer.parseInt(reader.readLine());
//        int d = Integer.parseInt(reader.readLine());
//        int e = Integer.parseInt(reader.readLine());
//
//        int [] numb = {a, b, c, d, e};
//
//        System.out.println(Arrays.toString(numb));
//        for (int i = 0; i < 5; i++) {
//            System.out.println(numb[i]);
//        }
        System.out.println("Введите колличество чисел, которые нобходимо отсортировать по возрастанию:");
        int k = Integer.parseInt(reader.readLine());
        int [] num = new int[k];
        System.out.println("Вводите последовательно числа через Enter:");


        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                System.out.println("Введите первое число:");
                num[i] = Integer.parseInt(reader.readLine());

            }else if (i == num.length -1) {
                System.out.println("Введите последнее число:");
                num[i] = Integer.parseInt(reader.readLine());

            } else {
                System.out.println("Введите число следующее число:");
                num[i] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("Вуаля:) Числа магическим образом отсортированы!");
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
