package lesson_studying;

import java.util.Scanner;

public class EqualizeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] occurances = new int[101];
        System.out.print("Girilecek dizi uzunluğunu giriniz: ");
        int n = in.nextInt();
        int maxOccurances = 0;

        for (int i = 0; i < n; i++)
        {
            int ai = in.nextInt();
            occurances[ai]++;
            if (occurances[ai] > maxOccurances)
            {
                maxOccurances = occurances[ai];
            }
        }
        System.out.println(n - maxOccurances);

    }
}
