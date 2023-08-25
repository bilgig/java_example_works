package class_examples.stack_heap;

public class Main {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int age=30;
        System.out.println("");
    }
    public static int changeAge(int age){
        age=50;
        return age;
    }
    public static int[] numbers(int [] numbers){
        for (int i=0; i<numbers.length;i++) {
            numbers[i]=2;
        }
        return  numbers;
    }
}
