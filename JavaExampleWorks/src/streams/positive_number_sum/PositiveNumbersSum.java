package streams.positive_number_sum;

import java.util.Arrays;
import java.util.List;

public class PositiveNumbersSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,-1,8,-2,5,12);
        int sum=list.stream()
                .mapToInt(Integer::intValue)
                .filter(e->e>0)
                .sum();
        System.out.println("Toplam: "+sum);
    }
}
