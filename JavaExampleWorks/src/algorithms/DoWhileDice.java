package algorithms;

import java.util.Random;
import java.util.Scanner;

public class DoWhileDice {
    public static void main(String[] args) {

    Random rastgele = new Random();

    int dice1=0;
    int dice2=0;
    int sayac=0;

    do{
         dice1 = rastgele.nextInt(6)+1;
         dice2 = rastgele.nextInt(6)+1;
         sayac++;
         if(dice1==6 && dice2==6) {
             break;
         }

        System.out.println(sayac+". atışta "+"Birinci zarın değeri "+dice1+" İkinci zarın değeri "+ dice2);
    }while(true);

        System.out.println(sayac+". atışta iki zar 6 geldi.");



    }
}
