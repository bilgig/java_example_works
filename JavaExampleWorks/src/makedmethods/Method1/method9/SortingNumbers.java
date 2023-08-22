package makedmethods.Method1.method9;

public class SortingNumbers {
    public static void main(String[] args) {
        int[] arr={5,2,3,3,4,4,5,70,23};
        int sonuc[] =sortingNumbers(arr);
        for (int num:sonuc) {
            System.out.println(num);

        }
    }

    static int [] sortingNumbers(int[] arr) {
        int gecici = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)

                if (arr[i] > arr[j]) {
                    gecici = arr[i];
                    arr[i]=arr[j];
                    arr[j]=gecici;
                }
        }

        return arr;
    }
}

