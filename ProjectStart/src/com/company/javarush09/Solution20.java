package com.company.javarush09;

//    Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
//    Обернуть вызов sleep в try..catch.
//
//    Требования:
//    •	Программа должна выводить отсчет от 10 до 0.
//    •	Программа должна выводить на экран новое число каждые 100 миллисекунд.
//    •	Программа должна использовать метод "Thread.sleep(100);".
//    •	Метод main должен содержать блок try..catch.
//    •	Метод main не должен кидать исключений.

public class Solution20 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
