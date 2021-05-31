package com.company.javarush05;

public class Dog {
    public String name;
    public int height;
    public String color;

    public void initialize (String name) {
        this.name = "Bim";
    }

    public void initialize (String name, int height) {
        this.name = "Bim";
        this.height = 90;
    }

    public void initialize (String name, int height, String color) {
        this.name = "Bim";
        this.height = 90;
        this.color = "Black";
    }

    public static void main(String[] args) {

    }
}
