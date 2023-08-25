package list_examples;

import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("java");
        names.add("C#");
        names.add("Python");
        System.out.println("List before Set: "+names);
        names.set(1,"Scala");
        System.out.println("List after Set: "+names);
    }
}
