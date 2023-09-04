package stream;

import java.util.stream.IntStream;

public class StreamExample01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

    }



}
