package Algorithms;

import java.util.Scanner;

public class MethodsExamples01 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        String username=scanner.next();
        sayHello(username);
        System.out.println("-");
        finMyNote(60);

    }
    static void sayHello(String username){
        System.out.println("hello: "+username);
    }

    static void finMyNote(int note){
        if(note>50){
            System.out.println("Notunuz "+note+" Başarıyla sınavı geçtiniz.");
        }else{
            System.out.println("Notunuz "+note+" Sınavdan kaldınız.");
        }
    }
}
