package com.company.javarush04;

//        •	Программа должна считывать числа c клавиатуры.
//        •	Программа должна содержать System.out.println() или System.out.print()
//        •	Если два числа равны между собой, необходимо вывести числа на экран.
//        •	Если все три числа равны между собой, необходимо вывести все три.
//        •	Если нет равных чисел, ничего не выводить.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String str3 = reader.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        int c = Integer.parseInt(str3);
        if (a == b && a == c)
            System.out.println(a + " " + b + " " + c);
        else if (a == b)
            System.out.println(a + " " + b);
        else if (a == c)
            System.out.println(a + " " + c);
        else if (b == c)
            System.out.println(b + " " + c);
    }
}
