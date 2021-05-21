package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        /*  >
            <
            >=
            <=
            == 'проверка со значением'
            != 'не равно'
            && 'и' проверка до первого false
            || 'или' проверка до первого совпадения и дальше не проверяет
            &  'и' проверка всех условий, даже если в первом было false
            |   'или' проверка всех условий
         */

        if(num1 < num2){
            System.out.println(num1);
        }else if(num1 > num2){
            System.out.println(num2);
        }else {
            System.out.println("Equals");
        }
    }
}
