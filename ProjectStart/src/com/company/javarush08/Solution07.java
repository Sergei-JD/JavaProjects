package com.company.javarush08;

//    Нужно   создать два списка - LinkedList и ArrayList.
//    Требования:
//    •	Программа не должна выводить текст на экран.
//    •	Программа не должна считывать значения с клавиатуры.
//    •	Программа должна содержать только три метода.
//    •	Метод createArrayList() должен создавать и возвращать список ArrayList.
//    •	Метод createLinkedList() должен создавать и возвращать список LinkedList.

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution07 {
    public static Object createArrayList() {
        return new ArrayList();
    }

    public static Object createLinkedList() {
        return new LinkedList();
    }

    public static void main(String[] args) {

    }
}
