package com.company.javarush05;
// вывод суммы чисел, вводимых с клавиатуры, со знаковым словом "сумма"
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("сумма"))
                break;
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
