package algorithms;

import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı dizisi giriniz: ");
        int sayi=scanner.nextInt();
        int sayiTers=0;
        while(sayi!=0){
            sayiTers=sayiTers*10;
            sayiTers=sayiTers+sayi%10;
            sayi=sayi/10;
        }
        System.out.println("Girilen sayının tersi: "+ sayiTers);
    }

}

