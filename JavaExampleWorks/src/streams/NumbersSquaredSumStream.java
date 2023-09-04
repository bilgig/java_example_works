package streams;

import java.util.Arrays;
import java.util.List;

public class NumbersSquaredSumStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int listSquaredSum=list.stream()
                .map(e->e*e)
                .reduce(0,(a,b)->a+b);
        System.out.println("List Squared Sum: "+ listSquaredSum);
    }


}
