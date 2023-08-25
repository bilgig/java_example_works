package list_examples;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList06 {
    public static void main(String[] args) {
        LinkedList < Integer > numbers = new LinkedList <>();
        Collections.addAll(numbers,1, 2, 3,4);
        numbers.replaceAll(e -> e*2);
        System.out.println(numbers);
    }
}
