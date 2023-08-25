package algorithms;

import java.util.Scanner;
//Java 100lük Sistemdeki Notu 5lik Sisteme Çevirme Örneği
public class ConvertPentagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Sayı giriniz: ");
        //try {
        double examScore = scanner.nextDouble();
        // int examScore = scanner.nextInt();
        //double examScoreD= examScore;
        /*} catch (NumberFormatException e) {
            System.out.printf("Sayı giriş hatası");
        } catch (IOException e) {
            System.out.println("Klavyeden okuma hatası");
        }*/
        if (examScore < 0) {
            System.out.printf("Hatalı not");
        } else if (examScore < 50) {
            System.out.printf("Kaldı, not 1'dir");
        } else if (examScore < 60) {
            System.out.printf("Geçer, not 2'dir");
        } else if (examScore < 70) {
            System.out.printf("Orta, not 3'dir");
        } else if (examScore < 85) {
            System.out.printf("iyi, not 4'dir");
        } else {
            System.out.printf("Pekiyi, not 5'dir");
        }

    }
}




