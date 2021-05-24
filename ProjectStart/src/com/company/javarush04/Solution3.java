package com.company.javarush04;

//Работа светофора для пешеходов запрограммирована следующим образом:
//        в начале каждого часа в течение трех минут горит зелёный сигнал,
//        затем в течение одной минуты - жёлтый,
//        а потом в течение одной минуты - красный,
//        затем опять зелёный горит три минуты и т. д.
//        Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
//        Определить, сигнал какого цвета горит для пешеходов в этот момент.
//        Результат вывести на экран в следующем виде:
//        "зелёный" - если горит зелёный цвет,
//        "жёлтый" - если горит жёлтый цвет,
//        "красный" - если горит красный цвет.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        double minutes = Double.parseDouble(str);
        if (minutes % 5 >= 0 && minutes % 5 < 3)
            System.out.println("зелёный");
        else if (minutes % 5 <4 && minutes % 5 >= 3)
            System.out.println("жёлтый");
        else if (minutes % 5 < 5 && minutes % 5 >= 4)
            System.out.println("красный");
    }
}
