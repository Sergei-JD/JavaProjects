package com.company.javarush06;

public class EnumExample {
    enum CoffeSize {SMALL(100), MEDIUM(200), BIG(300) {
        String getCoffeClass() {
            return "B";
        }
    };
        String coffeClass = "A";
        int milliliters;
        CoffeSize(int milliliters) {
            this.milliliters = milliliters;
        }
        int getMilliliters() {
            return milliliters;
        }
        String getCoffeClass() {
            return coffeClass;
        }
    }

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMilliliters());
        System.out.println(coffeSize.getCoffeClass());
    }
}
