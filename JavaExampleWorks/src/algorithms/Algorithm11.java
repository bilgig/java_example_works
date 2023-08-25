package algorithms;

import java.util.Scanner;

//Kullanıcının girdiği 3 sayıdan en büyük olanını bulma
public class Algorithm11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int number1= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int number2= scanner.nextInt();
        System.out.println("üçüncü sayıyı giriniz: ");
        int number3= scanner.nextInt();
        int ikiSayidanEnBuyuk = Math.max(number1, number2);
        int enbuyuk=Math.max(ikiSayidanEnBuyuk, number3);
        System.out.println("En büyük sayı: " +enbuyuk);


    }
}
