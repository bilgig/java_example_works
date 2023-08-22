package hash_map_examples;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static void main(String[] args) {
        HashMap<String, Double> menuHashMap=new HashMap<>();
        menuHashMap.put("Izgara Tavuk", 300.);
        menuHashMap.put("Kavurma", 500.);
        menuHashMap.put("Burger",200.);
        menuHashMap.put("Lahmacun",150.);
        menuHashMap.put("Kurufalsulye",180.);
        System.out.println("All Menu: "+menuHashMap.entrySet());
        for(Map.Entry <String, Double> entry: menuHashMap.entrySet() ){
            System.out.println(entry.getKey()+"="+
            entry.getValue());
        }
    }
}
