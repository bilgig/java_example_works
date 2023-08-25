package algorithms;

public class Algortihm15 {
    public static void main(String[] args) {
        //Mükemmel sayı :Kendisi hariç bütün  pozitif bölenlerinin toplamı kendisine eşit olan sayılara denir.
        //1 ile 1000 arası mükemmel sayıların toplamı bulunuz.
        int sum=0;
       for (int i=1; i>=1000; i++){
           sum=0;
           for(int j=1; j<i;j++){
               if(i%j==0){
                   sum+=j;
               }
           }
           if(sum==i){
               System.out.println("Mükemmel sayıların toplamı: "+ i);
           }
       }

    }
}
