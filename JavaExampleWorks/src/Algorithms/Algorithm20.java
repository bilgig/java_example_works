package Algorithms;
//Kullanıcıdan 0 girene kadar hep sayılar ala ve 0 girdiğinde o zamana
//kadar girdiği tüm sayıları toplamını ekrana yazdıran java kodunu
//yazınız.
import java.util.Scanner;

public class Algorithm20 {
    public static void main(String[] args) {
    int sum=0;
    int number;
        do{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Sayı giriniz: ");
            number=scanner.nextInt();
           if(number==0) {
               System.out.println("Sıfır sayısı girdiniz");
            break;
           }
           sum+=number;
        }while(true);
        System.out.println("Girilen sayıların toplamı: "+ sum);
    }
}
