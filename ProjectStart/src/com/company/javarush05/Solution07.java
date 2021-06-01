package com.company.javarush05;

// ћетод дл¤ округлени¤ вещественных чисел "DecimalFormat"

import java.text.DecimalFormat;

public class Solution07 {
    public static void main(String[] args)  {

        double d = 0.000;
        for (int i=1; i <= 10; i++) {
            d += 0.1111;
        }
        DecimalFormat df = new DecimalFormat("#");
        df.format(d);
        System.out.println(df.format(d));
    }
}
