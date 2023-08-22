package list_examples01;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println("List: "+ numbers);
        int number1=numbers.get(2);
        System.out.println("number1: "+number1);
        int number2=numbers.getFirst();
        System.out.println("number2: "+ number2);
        int number3=numbers.getLast();
        System.out.println("number3: "+number3);

        int removedNumber=numbers.remove(1);
        System.out.println("removed number: "+ removedNumber);
        System.out.println("List: "+ numbers);
        LinkedList<String> names=new LinkedList<>();
        names.add("java");
        System.out.println(names);
    }
}
