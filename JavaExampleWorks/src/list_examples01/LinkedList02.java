package list_examples01;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("LinkedList: "+animals);
        String str=animals.get(1);
        System.out.println("Element at indext 1: "+str);
        int i=0;
        System.out.println("Element at index 0: "+ animals.get(i));
    }
}
