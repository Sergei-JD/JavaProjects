package com.company.date;

//  Наступило ли уже некоторое время

import java.util.Date;

public class Date03 {
    public static void main(String[] args) {
        Date startTime = new Date();

        //+5 секунд
        long endTime = startTime.getTime() + 5000;
        Date endDate = new Date(endTime);

        //ждем 3 секунды
        Date currentTime = new Date();

        //проверяем что время currentTime после endDate
        if(currentTime.after(endDate)) {
            System.out.println("End time!");
        }
    }
}
