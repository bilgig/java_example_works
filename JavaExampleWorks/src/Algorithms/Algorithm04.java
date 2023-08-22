package Algorithms;

import java.util.Scanner;

public class Algorithm04 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);

        System.out.println("Number1 giriniz : ");
        int number1= entry.nextInt();

        System.out.println("Number2 giriniz : ");
        int number2= entry.nextInt();

        if (number1==0 || number2==0) {
            System.out.println("Sıfırdan Farklı bir sayı giriniz");
        }else {
            System.out.println("Number1 and number2 toplamı: " + (number1 + number2));
        }
    }
}
