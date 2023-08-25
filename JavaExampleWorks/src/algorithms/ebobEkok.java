package algorithms;

import java.util.Scanner;

public class ebobEkok {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Sayi1'i giriniz: ");
            int sayi1 = scanner.nextInt();
            System.out.print("Sayi2'i giriniz: ");
            int sayi2 = scanner.nextInt();
            int ebob=0;
            for(int i=1;i<=sayi1 && i<=sayi2;i++ ){
                if (sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                }
            }
            System.out.println("İki sayının ebobu: "+ ebob);
            System.out.println("İki sayının ekoku: "+((sayi1*sayi2)/ebob));
        }
}
