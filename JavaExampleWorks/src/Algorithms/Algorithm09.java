package Algorithms;

import com.sun.org.apache.bcel.internal.classfile.EnumElementValue;
import javafx.scene.transform.Scale;

import java.util.Scanner;
//Girilen sayının tekmi yada çift mi olduğunu gösteren uygulama
public class Algorithm09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number= scanner.nextInt();
        if(number%2==0){
            System.out.println("Girilen sayı çifttir.");
        }else{
            System.out.println("Girilen sayı tektir.");
        }

    }
}
