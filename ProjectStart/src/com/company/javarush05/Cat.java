package com.company.javarush05;
//Реализуй метод boolean fight(Cat anotherCat):
//продумай механизм драки котов в зависимости от их веса, возраста и силы.
//Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
//Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
//Если ничья и никто не выиграл, возвращаем false.

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int a = 0;

        if (this.age>anotherCat.age)
            a++;
        else if (this.age<anotherCat.age)
            a--;

        if (this.weight>anotherCat.weight)
            a++;
        else if (this.weight<anotherCat.weight)
            a--;

        if (this.strength>anotherCat.strength)
            a++;
        else if (this.strength<anotherCat.strength)
            a--;

        if (a > 0)
            System.out.println("1");

        else if (a < 0)
            System.out.println("2");

        else
            System.out.println("Ничья");
        return true;
    }

    public static void main(String[] args)  {
        Cat a = new Cat();
        Cat b = new Cat();

        a.age = 2;
        b.age = 1;

        a.weight = 4;
        b.weight = 5;

        a.strength = 100;
        b.strength = 110;

        System.out.println(a.fight(b));
    }
}
