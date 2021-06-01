package com.company.javarush05;

//Ромб со стороной вводимого с клавиатуры значения

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s1 = r.readLine();
        int a = Integer.parseInt(s1);
        a -= 1; /* так как длина стороны строится в нижней части */
//        строим верхнюю часть
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("**");
            }
            System.out.println();
        }
//        строим нижнюю часть
        for (int i = a; i >= 0; i--) {
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("**");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
