package com.HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tsk3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        int x = 0;


        String a = "";

        String b="stop";
        while(!a.equals(b)){
            x = reader.read();
            a = reader.readLine();
            summa +=x;
        }

        System.out.println(summa);

    }
    }


