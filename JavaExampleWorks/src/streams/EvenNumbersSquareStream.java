package streams;

import java.util.stream.Stream;

public class EvenNumbersSquareStream {
    public static void main(String[] args) {
    Stream.of(2,5,7,6,10,70,24,26,71,69)
                .filter(e->e%2==0)
                .map(e->e*e)
            .forEach(System.out::println);
    }
}
