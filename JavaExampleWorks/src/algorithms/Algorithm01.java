package algorithms;

import java.util.Scanner;

public class Algorithm01 {
    public static void main(String[] args) {
        //Girilen iki sayının toplamını bulan ve sonucu ekrana yazdıran programın algoritmasını yazınız.
        Scanner entry=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int firtresult=entry.nextInt();
       // System.out.println("Girdiğiniz say: "+ result);
        System.out.println("İkinci sayıyı giriniz ");
        int secondresult=entry.nextInt();
        int sum=firtresult+secondresult;
        System.out.println("Sayıların toplamı: "+sum);
        int minus=firtresult-secondresult;
        System.out.println("firtresult-secondresult sonucu: "+minus);
        int multipy=firtresult*secondresult;
        System.out.println("firtresult*secondresult sonucu: "+multipy);
        int divide=firtresult/secondresult;
        System.out.println("firtresult/secondresult sonucu: "+divide);

    }
}
