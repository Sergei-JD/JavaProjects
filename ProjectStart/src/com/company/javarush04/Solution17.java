package com.company.javarush04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);

        for (int i = n; i > 0 ; i--) {
            for (int j = m; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
