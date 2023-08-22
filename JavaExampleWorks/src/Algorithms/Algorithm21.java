package Algorithms;

public class Algorithm21 {
    public static void main(String[] args) {
       int arr[]={12,5,3,8,9};
       int tempt;
       for(int i=0;i< arr.length/2;i++ ){
           tempt=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=tempt;
       }


        for (int j:arr) {
            System.out.println(j);
        }
    }

}
