package algorithms;

import java.util.Scanner;

public class reverseString2 {
    static String tersYuz(String metin){
        String sonuc="";
        int i;
        for (i=metin.length()-1; i>=0;i--){
            sonuc +=metin.charAt(i);
        }
      return sonuc;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Metin giriniz: ");
        String metin=scanner.nextLine();
        System.out.println("Girilen metin tersi: "+ tersYuz(metin) );
    }

}

