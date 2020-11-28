package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements=Integer.parseInt(reader.readLine());

        String[] string = new String[numberOfElements];

        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 0) {
                string[i] = "lm";
            } else {
                string[i] = "Td";
            }
            System.out.println(string[i]);
        }




    }
}

