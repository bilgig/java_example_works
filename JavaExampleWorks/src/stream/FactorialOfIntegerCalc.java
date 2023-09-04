package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FactorialOfIntegerCalc {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream()
                .mapToInt(Integer::valueOf)
                .map(e->factorialCalc(e)).forEach(System.out::println);
}

    private static int factorialCalc(int e) {
        return IntStream.rangeClosed(2,e).reduce(1,(int a,int b)->a*b);
    }
    }
