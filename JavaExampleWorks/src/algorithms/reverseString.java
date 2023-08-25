package algorithms;

import java.util.Scanner;
public class reverseString {
    static String tersYaz(String metin) {
        String sonuc ="";
        int i;

        for(i=metin.length()-1; i>=0; i--){
            sonuc+=metin.charAt(i);
        }

        return sonuc;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kelime giriniz: ");
        String metin=scan.nextLine();

        System.out.println(tersYaz(metin));
    }

}

