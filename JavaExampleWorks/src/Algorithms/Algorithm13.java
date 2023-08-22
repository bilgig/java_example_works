package Algorithms;

import java.util.Scanner;

//Girilen iki sayı arasındaki tekler ve çiftlerin toplamını ve ortalamasını bul.
public class Algorithm13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz: ");
        int number1= scanner.nextInt();
        System.out.println("2. Sayıyı giriniz: ");
        int number2= scanner.nextInt();
        int buyukSayi = Math.max(number1, number2);
        int kucukSayi=Math.min(number1, number2);
        double ciftToplam=0, tekToplam=0;
        double ciftOrt=0, tekOrt=0;
        int ciftNumbers=0;
        int tekNumbers=0;
        if(buyukSayi==kucukSayi) {
            System.out.println("Aynı sayıyı girdiniz. Programı tekrar çalıştırınız.");
        }else {
            for (int i = kucukSayi; i <= buyukSayi; i++) {
                if (i % 2 == 0) {
                    System.out.println("Çift sayılar: " + i);
                    ciftToplam = ciftToplam + i;
                    ciftNumbers++;
                } else {
                    System.out.println("Tek sayılar: " + i);
                    tekToplam = tekToplam + i;
                    tekNumbers++;
                }
            }

        tekOrt=tekToplam/ciftNumbers;
        ciftOrt=ciftToplam/tekNumbers;
        System.out.println("Çift sayıların toplamı: "+ciftToplam+" "+"Çift sayıların ortalaması: "+ciftOrt);
        System.out.println("Tek sayıların toplamı: "+tekToplam+" "+"Tek sayıların ortalaması: "+ tekOrt);
        }
    }
}
