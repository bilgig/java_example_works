package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int sayac1=0;
        int sayac2=0;
        int sayac3=0;

        for (Integer integer : arr) {
            if(integer<0){
                sayac1++;
            }
            if(integer==0){
                sayac2++;
            }
            if(integer>0){
                sayac3++;

            }
        }
        double rate1= (double) sayac1 /arr.size();
        double rate2= (double) sayac2 /arr.size();
        double rate3= (double) sayac3 /arr.size();
        System.out.println("negative number rate: "+rate1);
        System.out.println("zero number rate: "+rate2);
        System.out.println("negative number rate: "+rate3);
    }

    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);


    }


}


