package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringLenghtSortStream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java", "Python", "C++","JavaScript","Ruby");
        list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
