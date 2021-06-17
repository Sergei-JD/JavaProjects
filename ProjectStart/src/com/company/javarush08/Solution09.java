package com.company.javarush08;

//    Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//    Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.
//
//    Требования:
//    •	Программа должна выводить числа на экран.
//    •	Метод main должен вызывать метод getGetTimeInMs только два раза.
//    •	Метод main должен вызывать метод fill только два раза.
//    •	Метод fill(List list) должен вставлять 10 тысяч элементов в список.
//    •	Метод get10000(List list) должен производить 10 тысяч вызовов get для списка.
//    •	Метод getGetTimeInMs должен вызывать метод get10000(List list) только один раз.
//    •	Метод getGetTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вызовов get для списка.

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution09 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date startTime = new Date();
        insert10000(list);
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
