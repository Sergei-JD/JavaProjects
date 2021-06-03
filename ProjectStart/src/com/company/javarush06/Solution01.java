package com.company.javarush06;

public class Solution01 {
    public static void main(String[] args) {
        for (int i = 0; i < 200000; i++) {
            Fox fox = new Fox();
            Hippo hippo = new Hippo();
        }
    }
}

class Fox {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Fox was destroyed");
    }
}

class Hippo {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Hippo was destroyed");
    }
}
