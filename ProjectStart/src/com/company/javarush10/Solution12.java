package com.company.javarush10;

//    Напиши класс Human с 6 полями.
//    Придумай и реализуй 10 различных конструкторов для него.
//
//    Требования:
//    •	Программа не должна считывать данные с клавиатуры.
//    •	В классе Human должно быть 6 полей.
//    •	Все поля класса Human должны быть private.
//    •	В классе Human должно быть 10 конструкторов.
//    •	Все конструкторы класса Human должны быть public.

public class Solution12 {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int height;
        private int weight;
        private String colorEyas;
        private int child;

        public Human(){
        }

        public Human(String name){
            this.name = name;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, int age, int height, int weight){
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, int height, int weight, String colorEyas){
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.colorEyas = colorEyas;
        }

        public Human(String name, int age, int height, int weight, String colorEyas, int child){
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.colorEyas = colorEyas;
            this.child = child;
        }

        public Human(String name, int age, String colorEyas, int child){
            this.name = name;
            this.age = age;
            this.colorEyas = colorEyas;
            this.child = child;
        }

        public Human(String name, int age, int height, String colorEyas){
            this.name = name;
            this.age = age;
            this.height = height;
            this.colorEyas = colorEyas;

        }

        public Human(String name,String colorEyas){
            this.name = name;
            this.colorEyas = colorEyas;
        }

    }
}
