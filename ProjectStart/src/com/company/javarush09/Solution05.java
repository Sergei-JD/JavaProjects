package com.company.javarush09;

//    Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
//    Это же число метод должен выводить на экран.
//
//    Требования:
//    •	Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
//    •	Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
//    •	Воспользуйся методом Thread.currentThread().getStackTrace().
//    •	Метод main должен вызывать метод getStackTraceDepth.

public class Solution05 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        int deep = Thread.currentThread().getStackTrace().length;
        System.out.println(deep);
        return deep;
    }
}
