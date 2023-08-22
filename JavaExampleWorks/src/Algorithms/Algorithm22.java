package Algorithms;
//
public class Algorithm22 {
    public static void main(String[] args) {
       double numbers[]={12,4,5,2,5,7};

       for(int i=0;i< numbers.length;i++ ){
         //numbers[i]=numbers[i]*numbers[i];
           numbers[i]=Math.pow(numbers[i],2);
       }
        for (double j:numbers) {
            System.out.println(j);

        }

    }

}
