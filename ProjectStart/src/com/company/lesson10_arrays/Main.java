package com.company.lesson10_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 40; //создание обычной переменной - a[40]
//        int[] arr = new int[10]; //создание массива с размерностью 10 - arr[0[30] 1[0] 2[0] 3[0] 4[0] 5[0] 6[20] 7[0] 8[0] 9[0]]
          int[] arr = new int[]{32, 432, 5, 34, 324, 2363}; //создание массива с инициализацией его элементов типа int с размерностью 6
          String[] arrstring = new String[]{"32", "432", "5", "34", "324", "2363"}; //создание массива с инициализацией его элементов типа String с размерностью 6

//        arr[0] = 30;
//        arr[6] = 20;
//        System.out.println(arr.toString());
//        System.out.println(arr[0]);

//        //далее инициализация элементов массива типа arr[0[1] 1[2] 2[3] 3[4] 4[5] 5[6] 6[7] 7[8] 8[9] 9[10]] с помощью цикла
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 9 - i;
//        }

        //далее вывод всего массива в консоль
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//
//        //дмухмерный массив
//        int[][] array = new int[2][3];
//
//        //далее инициализация элементов двухмерного массива по три элемента в каждом
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]);
//
//            }
//            System.out.println();
//        }
        //метод вспомогательного класса Arrays  позволяющий отсортировать элементы массива при выводе в консоль
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
