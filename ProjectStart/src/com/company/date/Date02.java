package com.company.date;

//  Вычисление разницы между двумя датами

import java.util.Date;

public class Date02 {
    public static void main(String[] args) throws InterruptedException {
        //получаем текущую дату и время
        Date currentTime = new Date();

        //ждём 3 секунды – 3000 миллисекунд
        Thread.sleep(3000);

        //получаем новое текущее время
        Date newTime = new Date();

        //вычисляем разницу
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
