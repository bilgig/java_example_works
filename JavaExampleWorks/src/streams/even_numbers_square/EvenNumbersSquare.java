package streams.even_numbers_square;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersSquare {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .filter(e->e%2==0)
                .mapToInt(Integer::valueOf)
                .map(e->e*e)
                .forEach(System.out::println);
    }
}
