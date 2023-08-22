package list_examples01;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList04 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(11);
        System.out.println("Before sort: "+ numbers);
        Collections.sort(numbers);
        System.out.println("After sort: "+ numbers);
        Collections.sort(numbers,Collections.reverseOrder());
        numbers.sort(Collections.reverseOrder());
        System.out.println("After reverse: "+numbers);
        System.out.println("Size: "+numbers.size());
        LinkedList numbers2= (LinkedList) numbers.clone();
        LinkedList<Integer> numbers3=numbers;
        System.out.println(numbers2);
        System.out.println(numbers3);
        System.out.println(numbers.contains(1));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.isEmpty());
        LinkedList<Integer> numbers4=new LinkedList<>();
        System.out.println(numbers4.isEmpty());
        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.indexOf(2));
        System.out.println("for-each");
        for(Integer number: numbers){
            System.out.println(number);
        }




    }
}
