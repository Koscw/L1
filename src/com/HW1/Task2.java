package com.HW1;

public class Task2 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число  ");
        int num1  = scanner.nextInt();
        int l =1;
        for(int i=1; i<= num1 ; i++ ){
            l=i*l;
        }
        System.out.println("Factorial = "+num1 + " - " + l);

         */
        recursionFunc(5);

    }
    public static int recursionFunc(int a){
        int result =1;
        if(a==0){
            return result;
        }
        result = a*recursionFunc((a-1));

        System.out.println(result);
        return result;
    }
}
