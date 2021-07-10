package com.company.javarush13;

//    В этой задаче нужно:
//    Создать класс EnglishTranslator, который наследуется от Translator.
//    Реализовать все абстрактные методы.
//    Подумай, что должен возвращать метод getLanguage.
//    Сделать так, чтобы программа выводила: "Я переводчик с английского" путем вызова метода translate у объекта типа EnglishTranslator.
//    Требования:
//    Класс EnglishTranslator нужно объявить внутри класса Solution.
//    Класс EnglishTranslator должен наследоваться от класса Translator.
//    В классе EnglishTranslator должны быть реализованы все унаследованные от класса Translator абстрактные методы.
//    Метод getLanguage должен возвращать строку, которая позволит выполнить условие задачи.
//    Метод main должен выводить на экран строку: "Я переводчик с английского" путем вызова метода translate у объекта типа EnglishTranslator.
/*
Нанимаем переводчика
*/

public class Solution11 {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    static class EnglishTranslator extends Translator{
        @Override
        public String getLanguage() {
            return "английского";
        }

        @Override
        public String translate() {
            return super.translate();
        }
    }

}
