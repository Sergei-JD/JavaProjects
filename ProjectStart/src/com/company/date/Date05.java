package com.company.date;

//  Сколько дней прошло с начала года

import java.util.Date;

public class Date05 {
    public static void main(String[] args) {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);


        // первое число
        yearStartTime.setDate(1);

        // месяц январь, нумерация для месяцев 0-11
        yearStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();

        //сколько миллисекунд в одних сутках
        long msDay = 24 * 60 * 60 * 1000;

        //количество целых дней
        int dayCount = (int) (msTimeDistance / msDay);
        System.out.println("Days from start of year: " + dayCount);
    }
}
