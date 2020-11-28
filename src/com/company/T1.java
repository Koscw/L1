package com.company;

public class T1 {
    public static void main(String[] args) {

        recursionFucn(0);

    }

    public static void recursionFucn(int n) {
        System.out.println("Number = "+n);
        System.out.println("Java Hello!");
        if (n >= 100) {
            return;
        }
        recursionFucn(n + 1);

    }


}


