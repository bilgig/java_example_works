package generics;

import java.util.*;

public class GenericMethod {
    public static <T extends Collection<Integer>> void sampleMethod(T ele){
        Iterator<Integer> it=ele.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(24);
        list.add(56);
        list.add(89);
        list.add(75);
        list.add(36);
        sampleMethod(list);


    }
}
