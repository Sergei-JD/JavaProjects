package com.company.javarush04;
/*  Вывести на экран квадрат из 10х10 букв S используя цикл while.
    Буквы в каждой строке не разделять.
    •	Программа не должна считывать текст c клавиатуры.
    •	Программа должна выводить текст на экран.
    •	Программа должна выводить квадрат из 10х10 букв S.
    •	В программе должен использоваться цикл while.
 */

public class Solution15 {
    public static void main(String[] args){
        int i = 1;
        while (i < 10)
        {
            int j = 1;
            while (j < 10)
            {
                System.out.print("S");
                j++;
            }
            System.out.println("S");
            i++;
        }
    }
}
