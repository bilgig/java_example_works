package algorithms;

import java.util.Scanner;
//Klavyeden girilen sayının asal olup olmadığını söyleyen uygulama
public class Algorithm17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Asallığı sınanacak sayıyı girin: ");
        int N = in.nextInt();
        boolean asal = true;
        for( int i=2; i<=N/2; i++ ){
            if( N % i ==0 ) {
                asal = false;
                break;
            }
        }
        if( asal )
            System.out.println("Girilen sayı asaldır.");
        else
            System.out.println("Girilen sayı asal değildir.");
        in.close();
    }
}
