package com.HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int b =0;

        String title;



        do{
            System.out.print("Введите число");
            int a = reader.read();
            System.out.print("Введите ");
             title = reader.readLine();
            b=b+a;
        }while (title !="stop");
        if(title=="stop"){
            System.out.println(b);
        }



    }
}
