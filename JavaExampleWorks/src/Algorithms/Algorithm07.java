package Algorithms;

import java.util.Scanner;

public class Algorithm07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number1 giriniz: ");
        int number1= scanner.nextInt();
        System.out.println("Number2 giriniz: ");
        int number2= scanner.nextInt();
        int minNumber=Math.min(number1,number2);
        int maxNumber=Math.max(number1,number2);
        System.out.println("Min Number:  " +minNumber);
        System.out.println("Max Number:  "+maxNumber);

        if(number1>number2) {
            System.out.println("Number1 is largest number");
            System.out.println("Number2 is the smallest number");
        }
        else if(number1<number2){
            System.out.println("Number2 is the largest number");
            System.out.println("Number1 is the smallest number");
        }
        else{
            System.out.println("Two Numbers are equal");
        }
        }
    }


