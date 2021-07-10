package com.company.javarush13;

//    В этой задаче тебе нужно:
//    Создать интерфейс Person.
//    Добавить в него метод isAlive(), который проверяет, жив человек или нет.
//    Подумать, какой тип должен возвращать этот метод.
//    Создать интерфейс Presentable.
//    Унаследовать интерфейс Presentable от интерфейса Person.
//    Требования:
//    В классе Solution должен быть объявлен интерфейс Person.
//    В классе Solution должен быть объявлен интерфейс Presentable.
//    Интерфейс Presentable должен наследоваться от интерфейса Person.
//    В интерфейсе Person должен быть объявлен метод isAlive.
//    Тип возвращаемого значения метода isAlive может иметь только два значения.
/*
Эй, ты там живой?
*/

public class Solution08 {
    public static void main(String[] args) throws Exception {
    }

    interface Person{
        boolean isAlive();
    }

    interface Presentable extends Person{
    }
}
