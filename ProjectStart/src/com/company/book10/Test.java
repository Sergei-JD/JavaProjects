package com.company.book10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//возврат суммы цифр числа

public class Test {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        String n = String.valueOf(number);

        for (int i = 0; i < n.length(); i++){
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return sum;
    }
}
