package algorithms;

import java.util.Scanner;

//Kullanıcının girdiği 3 sayıdan en büyük olanını bulma

public class Algorithm10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int number1= scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int number2= scanner.nextInt();
        System.out.println("üçüncü sayıyı giriniz: ");
        int number3= scanner.nextInt();
        if(number1>=number2 && number1>=number3){
            System.out.println("Number1 En büyüktür: " +number1);
        }else if (number2>=number1 && number2>=number3){
            System.out.println("Number1 En büyüktür:"+number2);
        }else{
            System.out.println("Number3 En büyüktür:"+number3);
        }

    }
}
