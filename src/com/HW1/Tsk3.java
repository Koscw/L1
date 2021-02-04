package com.HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tsk3 {
    public static void main(String[] args) throws IOException {
        int summa=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String q ;

        String b="stop";
        while(true){

                q = reader.readLine();
                if(q.equals(b) && summa==0){
                    System.out.println("Вы не ввели числа");
                    break;
                }
                else if(q.equals(b)){
                    System.out.println("sum: "+summa);
                    break;
                }

            summa = summa + Integer.parseInt(q);
        }

    }

    }


