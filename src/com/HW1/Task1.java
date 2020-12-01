package com.HW1;


import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию  ");
        int a  = scanner.nextInt();
        char c = scanner.next().charAt(0);
        int b = scanner.nextInt();


        int result = 0;
        switch(c){
            case '+':
                result = a+b;
                break;
            case '-' :
                result=a-b;
                break;
            case '/' :
                result=a/b;
                break;
            case '%' :
                result=a%b;
                break;
            default:
                System.out.println("Операция была введена неправильно , попробуйте еще раз");
        }
        System.out.print("Операция равна : "+result);
    }
}
