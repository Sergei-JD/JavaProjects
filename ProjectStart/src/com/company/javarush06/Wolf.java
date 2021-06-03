package com.company.javarush06;

public class Wolf {
    public static void main(String[] args) {

    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("A Wolf was destroyed");
    }
}

