package com.company.javarush07;

public class Solution23 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignore) {
            }
        }

        System.out.println("Бум!");
    }

}
