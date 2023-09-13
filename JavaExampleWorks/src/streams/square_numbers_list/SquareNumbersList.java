package streams.square_numbers_list;

import java.util.Arrays;
import java.util.List;

public class SquareNumbersList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,6,8,10);
        List<Integer> newList=list.stream()
                .map(e->e*e)
                .toList();
        System.out.println("Nem List: "+newList);
    }
}
