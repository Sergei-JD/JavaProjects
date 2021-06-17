package com.company.javarush08;

//    1. Внутри класса Solution создать public static класс кот - Cat.
//    2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
//    3. В методе main удалите одного кота из Set cats.
//    4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
//    Каждый кот с новой строки.
//
//    Требования:
//    •	Программа должна выводить текст на экран.
//    •	Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
//    •	Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
//    •	Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
//    •	Метод main() должен один раз вызывать метод createCats().
//    •	Метод main() должен вызывать метод printCats().
//    •	Метод main() должен удалять одного кота из множества котов.

import java.util.HashSet;
import java.util.Set;

public class Solution19 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();

        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());

        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println(cat);

        }
    }

    public static class Cat {
    }
}
