package algorithms;

import java.util.Scanner;

public class Algorithm05 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        System.out.println("Enter the Number1");
        int number1=entry.nextInt();
        System.out.println("Enter the Number2");
        int number2=entry.nextInt();
        if(number1 !=0 && number2!=0){
            int sum=number1+number2;
            System.out.println("Girilen sayıların toplamı:  "+sum);
        }else {
            System.out.println("Girilen sayılardan en az bir tanesi sıfırdı. Bu yüzden işlem devam edemiyor.");
        }

    }
}
