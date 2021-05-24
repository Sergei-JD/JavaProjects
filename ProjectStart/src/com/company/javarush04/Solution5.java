package com.company.javarush04;

// Ввести с клавиатуры четыре числа, и вывести максимальное из них.
//Если числа равны между собой, необходимо вывести любое.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        String str4 = reader.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);
        int d = Integer.parseInt(str4);
        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else
            System.out.println(d);
    }
}
