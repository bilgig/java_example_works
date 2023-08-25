package lesson_studying;

import java.util.Scanner;

public class ForExample01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number= scanner.nextInt();
        int ciftsayac=0;
        int teksayac=0;
        System.out.print("Çift sayılar: ");
        for(int i=1;i<=number;i++){
            if(i%2==0) {
                ciftsayac++;
                System.out.println("sayı çift "+i);
            }else {
                teksayac++;
                System.out.println("sayı tek: "+i);
            }
        }
        System.out.println("\n" +ciftsayac+" çift sayı var");
        System.out.println(teksayac+" tek sayı var");
    }
}
