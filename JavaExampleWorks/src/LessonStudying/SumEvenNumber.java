package LessonStudying;

import java.util.Scanner;

public class SumEvenNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int sayi1=input.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int sayi2=input.nextInt();
        int toplam=0;
        for(int i=sayi1+1;i<sayi2-1;i++){
            if(i%2==0){
                toplam=toplam+i;
                i++;
            }
        }
        System.out.println(toplam);
    }

}
