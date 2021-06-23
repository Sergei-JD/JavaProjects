package com.company.javarush09;

//    Расставь модификаторы static так, чтобы пример скомпилировался.
//
//    Требования:
//    •	В классе должна быть переменная A.
//    •	В классе должна быть переменная B.
//    •	В классе должна быть переменная C.
//    •	Метод main не изменять.
//    •	Метод getA не изменять.
//    •	В классе должно быть 3 статических поля.

public class Solution25 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        solution.A = 5;

        Solution25.D = 5;
    }

    public int getA() {
        return A;
    }
}
