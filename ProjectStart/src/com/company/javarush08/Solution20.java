package com.company.javarush08;

//        1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
//        2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
//        3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Класс Human должен содержать четыре поля.
//        •	Класс Human должен содержать один метод.
//        •	Класс Solution должен содержать один метод.
//        •	Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution20 {
    public static void main(String[] args) {
        Human child1 = new Human("Алена", false, 32);
        Human child2 = new Human("Валентина", false, 29);
        Human child3 = new Human("Сергей", true, 27);

        Human father = new Human("Александр", true, 59, child1, child2, child3);
        Human mather = new Human("Людмила", false, 55, child1, child2, child3);

        Human grandPa1 = new Human("Сергей", true, 87, father);
        Human grandPa2 = new Human("Василий", true, 95, mather);

        Human grandMa1 = new Human("Наталья", false, 87, father);
        Human grandMa2 = new Human("Евгения", false, 95, mather);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;



            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
