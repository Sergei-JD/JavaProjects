package com.company.javarush05;

// Вывести на экран текущую дату в аналогичном виде "21 02 2014".

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution04 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
