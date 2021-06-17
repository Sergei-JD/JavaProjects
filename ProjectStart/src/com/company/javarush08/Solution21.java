package com.company.javarush08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Solution21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива:");
        int m = parseInt(reader.readLine());

        List<Integer> num = new ArrayList<>();
        System.out.println("Вводите числа в массив:");
        for (int i = 0; i < m; i++) {
            num.add(i, Integer.parseInt(reader.readLine()));
        }
        System.out.println("Выводим массив:");
        for (int i = 0; i < m; i++) {
            System.out.print(num.get(i) + " ");
        }
        System.out.println();


        int count = 1;
        int a = 1;

        for (int i=0; i<num.size()-1; i++){
            if (num.get(i).equals(num.get(i+1))){
                count++;
            }
            else {
                count=1;
            }
            if (count>a){
                a=count;
            }
            num.remove(num.get(i));
        }
        System.out.println(a);
    }
}
//        выбираем наиболее встречаемый элемент из массива
//        копируем его в новый массив
//        удаляем из старого масива его и все копии