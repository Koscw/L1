package com.HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tsk3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;



        String a = "";

        String b="stop";
        while(!a.equals(b)){
            String q= reader.readLine();
            Integer x= Integer.parseInt(q);
            a = reader.readLine();
            summa +=x;
        }

        System.out.println(summa);

    }
    }


