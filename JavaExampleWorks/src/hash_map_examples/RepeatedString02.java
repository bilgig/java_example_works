package hash_map_examples;
import java.util.HashMap;

public class RepeatedString02 {

    public static void main(String[] args) {
        String string = "Java öğreniyorum";
        HashMap<String, Integer> countOfAlfb = new HashMap<>();

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                continue;
            }
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {

                    count++;
                }

            }
            countOfAlfb.putIfAbsent(String.valueOf(string.charAt(i)), count);
            count = 0;

        }
        System.out.println("Repeated Alfb :" + countOfAlfb);
    }


}


