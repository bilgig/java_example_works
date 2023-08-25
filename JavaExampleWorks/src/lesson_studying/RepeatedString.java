package lesson_studying;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

        public static void main(String[] args) throws IOException {

            Scanner scanner=new Scanner(System.in);
            System.out.print("String ifadeyi giriniz: ");
            String s=scanner.nextLine();
            System.out.println("Girilen harf sayısı: "+s.length());
            System.out.print("Sınır değeri giriniz: ");
            int n=scanner.nextInt();

            long left = n%s.length();
            long leftCount = 0;
            long sayac = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    if( i < left ){
                        leftCount++;
                    }
                    sayac++;
                }
            }
            long rep = (long) Math.floor( n/s.length() );
            sayac = (sayac * rep) + leftCount;

            System.out.println("Sınıra kadar ki a sayısı: " + sayac);

        }
    }

