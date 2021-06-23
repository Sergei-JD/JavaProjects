package com.company.javarush09;

//    Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//    HashMap<String, String> map = new HashMap<String, String>(null);
//    map.put(null, null);
//    map.remove(null);
//
//    Требования:
//    •	Программа должна выводить сообщение на экран.
//    •	В программе должен быть блок try-catch.
//    •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//    •	Выведенное сообщение должно содержать тип возникшего исключения.
//    •	Имеющийся код в методе main не удалять.

import java.util.HashMap;

public class Solution11 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
