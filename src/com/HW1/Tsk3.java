package com.HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tsk3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;



        String q = "";

        String b="stop";
        while(!q.equals(b)){
            q= reader.readLine();
            Integer x= Integer.parseInt(q);
            summa +=x;
        }

        System.out.println(summa);

    }
    }


