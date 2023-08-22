package Algorithms;

import java.util.Scanner;
//Kullanıcı final ve vize notunu girsin.Vizenin %40, finalin %60 alınsın.
//Sonucun geçme durumu(AA,BA,BB,CC,FF ye göre) aşağıdaki kodlansın.
public class Algorithm12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Vize Notunu giriniz: ");
        double vizeNot=scanner.nextDouble();
        System.out.println("Final notunu giriniz: ");
        double finalNot=scanner.nextDouble();
        if (vizeNot>100 || finalNot>100){
            System.out.println("vize notunu 100 den büyük giriniz. Lütfen tekrar deneyiniz.");
            System.exit(1);
        }
        double sonuc=(vizeNot*0.4)+(finalNot*0.6);
        if(sonuc<45)
        {
            System.out.println("Notunuz FF: "+sonuc);
        } else if (sonuc>=45 && sonuc<60) {
            System.out.println("Notunuz CC: "+sonuc);
        } else if (sonuc>=60 && sonuc<70) {
            System.out.println("Notunuz BB:"+ sonuc);
        } else if (sonuc>=70 && sonuc<90) {
            System.out.println("Notunuz BA:"+ sonuc);
        } else if (sonuc>=90 && sonuc<=100) {
            System.out.println("Notunuz AA:"+ sonuc);
        }else
            System.out.println("100 den büyük Not girmemelisiniz");
    }
}
