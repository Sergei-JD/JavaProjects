package com.company.javarush06;

public class Rabbit {
    public static int rabbitCount = 0;

    public Rabbit(){
        rabbitCount++;
    }
    protected void finalize() throws Throwable{
        rabbitCount--;
        super.finalize();
    }

    public static void main(String[] args) {

    }
}
