package com.company.book09;

public class Test {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int meters = centimetre / 100;
        return meters;
    }
}
