package makedmethods.Method1.method9;

public class FindMostRepeated {
    public static void main(String[] args) {
        int[] arr={5,2,3,3,4,4};
        int n=6;
        int sonuc =migratoryBirds(n,arr);
        System.out.println(sonuc);
    }


    static int migratoryBirds(int n, int[] ar) {
        int counter[] = new int[6];
        int sonuc = 1; int max = 0;
        for (int i = 0; i < n; i++) {
            counter[ar[i]]++;
        }

        for (int i = 1; i <= 5; i++) {
            if (counter[i] > max) {
                sonuc = i;
                max = counter[i];
            }
        }

        return sonuc;
    }
}

