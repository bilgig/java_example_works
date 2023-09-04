package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NumbersLisrtExamples {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 100;i++){
           // numbers = random.nextInt(i);
            numbers.add(i);
        }
        Predicate<Integer> isEven=e-> e%2==0;
        List<Integer> evenList=new ArrayList<>();
        numbers.stream().filter(isEven).forEach(evenList::add);




    }
}
