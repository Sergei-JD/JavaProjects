package com.company.javarush04;
/*  Вывести на экран таблицу умножения 10х10 используя цикл while.
    Числа разделить пробелом.
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить таблицу умножения 10х10.
•	В программе должен использоваться только цикл while.

 */
public class Solution16 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10)
        {
            int j = 1;
            while (j <= 10)
            {
                System.out.print(i *j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
