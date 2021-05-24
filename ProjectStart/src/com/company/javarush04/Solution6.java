package com.company.javarush04;

//        Ввести с клавиатуры три числа, и вывести их в порядке убывания.
//        Выведенные числа должны быть разделены пробелом.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);
        if (a >= b && a >= c && b >= c)
            System.out.print(a + " " + b + " " + c);
        else if (a > c && c > b)
            System.out.print(a + " " + c + " " + b);
        else if (b > a && b > c && a > c)
            System.out.println(b + " " + a + " " + c);
        else if (b > c && c > a)
            System.out.println(b + " " + c + " " + a);
        else if (c > a && c > b && a > b)
            System.out.println(c + " " + a + " " + b);
        else if (c > b && b > a)
            System.out.println(c + " " + b + " " + a);
    }
}
