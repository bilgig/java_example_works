package algorithms;

import java.util.Scanner;

public class SumEntredNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi=0, toplam=0;
        for(int i=0; i<3;i++){
            System.out.println("Bir sayı giriniz: ");
            sayi=scanner.nextInt();
            toplam=toplam+sayi;

        }
        System.out.println("Toplam"+toplam);

    }
}
