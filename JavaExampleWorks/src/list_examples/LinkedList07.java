package list_examples;

import java.util.LinkedList;

public class LinkedList07 {
    public static void main(String[] args) {
        LinkedList<String> firstList=new LinkedList<>();
        firstList.add("Java");
        firstList.add("Python");

        LinkedList<String> secondList=new LinkedList<>();
        secondList.add("Scala");
        secondList.add("Kotlin");
        LinkedList<String> thirdList=new LinkedList<>();
        thirdList.add("ReactJS");
        firstList.addAll(secondList);
        firstList.addAll(thirdList);
        System.out.println(firstList);
        System.out.println(firstList.contains("Java"));
        System.out.println(firstList.contains("abc"));
    }
}
