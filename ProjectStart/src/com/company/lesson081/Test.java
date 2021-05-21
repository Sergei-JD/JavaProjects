package com.company.lesson081;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        while (!str.equals("exit")){
            System.out.println(str);
            str = reader.readLine();

        }

    }
}
