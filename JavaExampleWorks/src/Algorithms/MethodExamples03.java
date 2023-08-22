package Algorithms;

import java.lang.reflect.Array;

public class MethodExamples03 {
    public static void main(String[] args) {
        int[] arr={12,5,3,8,9};
        int[] numbers=reverseReturn(arr);
        for (int j:numbers) {
            System.out.println(j);
        }
    }

    static int[] reverseReturn(int[] arr){
        int tempt;
        for(int i=0;i< arr.length/2;i++ ){
            tempt=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tempt;
        }
        return arr;

    }
}
