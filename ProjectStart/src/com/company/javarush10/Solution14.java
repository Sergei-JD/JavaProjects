package com.company.javarush10;

import java.util.ArrayList;
import java.util.List;

/*
Массив списков строк
*/

public class Solution14 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[4];

        list[0] = new ArrayList<>();
        list[1] = new ArrayList<>();
        list[2] = new ArrayList<>();
        list[3] = new ArrayList<>();

        list[0].add("winter: december, january, february");
        list[1].add("spring: march, april, may");
        list[2].add("summer: june, july, august ");
        list[3].add("autumn: september, october, november");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
