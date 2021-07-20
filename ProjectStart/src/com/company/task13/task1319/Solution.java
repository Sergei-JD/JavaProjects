package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFileName));

        StringBuilder builder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")){
            s = reader.readLine();
            builder.append(s).append("\n");
        }

        writer.write(builder.toString());
        writer.close();
    }
}
