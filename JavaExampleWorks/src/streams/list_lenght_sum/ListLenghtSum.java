package streams.list_lenght_sum;

import java.util.Arrays;
import java.util.List;

public class ListLenghtSum {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Merhaba","Dünya","Java","Stream","API");
        int sum=list.stream()
                .map(e->e.length())
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Toplam: "+sum);
    }
}
