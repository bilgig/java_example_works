package algorithms;

import java.util.Locale;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "There's-a-starman-waiting-in-the-sky";
        int k = 3;
        System.out.println(caesarCipher(s, k));
    }

    public static String caesarCipher(String s, int k) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char next = s.charAt(i);
            char encrypted = next;

            if (Character.isUpperCase(next)) {
                encrypted = (char) ('A' + (next - 'A' + k) % 26);
            }
            if (Character.isLowerCase(next))  {
                encrypted = (char) ('a' + (next - 'a' + k) % 26);
            }
            result.append(encrypted);
        }
        return result.toString();
    }

    // create decryptData() method for decrypting user input string with given shift key



}

