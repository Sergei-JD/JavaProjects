package com.company.javarush05;

// вывести средней арифметической значение считываемых с клавиатуры чисел, не включая "ключевую" -1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());

            if (number == -1) {
                double sr = sum / count;
//                DecimalFormat df = new DecimalFormat("#.##");
//                df.format(sr);
                System.out.println(sr);
                return;
            }
            count++;
            sum += number;
        }
    }
}
