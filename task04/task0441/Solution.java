package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());

        int [] mas = {a, b, c, d, e, f};

        for(int i = mas.length - 1 ; i >= 0; i--){
            for (int j = 0; j <  i; j++) {
                if(mas[j] < mas[j + 1]){
                    int t = mas[j + 1];
                    mas [j + 1] = mas[j];
                    mas[j] = t;
                }

            }
        }

        System.out.println(mas);
    }
}
