package com.HW1;


import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {



        String a = (args[1]);
        int  result ;
        int b= Integer.parseInt(args[0]);
        int c=Integer.parseInt(args[2]);
        switch(a){
            case "+":
                result = b+c;
                System.out.println(result);
                break;
            case "-" :
                result= b-c;
                System.out.println(result);
                break;
            case "/" :
                result= b/c;
                System.out.println(result);
                break;
            case "%" :
                result= b%c;
                System.out.println(result);
                break;
            default:
                System.out.println("Операция была введена неправильно , попробуйте еще раз");
        }
        System.out.print("Операция равна : "+a);









    }

}
