package com.company.book04;
// минимум из разного количества входных данных для 4 (один метод) и для 2(второй метод)
public class Test {
    public static int min(int a, int b, int c, int d) {
        int i;
        if (a <= b && a <= c && a <= d) {
            i = a;
        } else if (b <= a && b <= c && b <= d) {
            i = b;
        } else if (c <= a && c <= b && c <= d) {
            i = c;
        }else
            i = d;
        return i;
    }

    public static int min(int a, int b) {
        int i;
        if (a <= b){
            i = a;
        }else
            i = b;
        return i;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

