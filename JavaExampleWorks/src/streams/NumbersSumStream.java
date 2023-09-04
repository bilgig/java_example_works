package streams;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class NumbersSumStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,20,25,30,35,40);
        //1. metod
        int sum1=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("All list sum: "+sum1);
        //2. metod
        int sum2=list.stream().reduce(0,(a,b)-> a+b);
        System.out.println("All list sum: "+sum2);

    }


}
