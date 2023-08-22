package Algorithms;

public class Algorithm23 {
    public static void main(String[] args) {
        double numbers[]={12,4,5,2,5,7};
        int tempt;
        for(int i=0;i< numbers.length;i++ ){
            //numbers[i]=numbers[i]*numbers[i];
            tempt=(int)Math.pow(numbers[i],2);
            System.out.println(tempt);

        }

    }

}
