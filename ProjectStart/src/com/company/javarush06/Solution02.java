package com.company.javarush06;

//Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
//Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
//Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
//Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution02 {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();

        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) % 2 == 0) {
                even++;
            } else
                odd++;
        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }

}
