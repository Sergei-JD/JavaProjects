package com.company.book06;
// ввод с клавиатуры данных и вывод конкатинированной строки в консоль
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
