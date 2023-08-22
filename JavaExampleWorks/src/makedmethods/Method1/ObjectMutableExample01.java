package makedmethods.Method1;

public class ObjectMutableExample01 {
    public static void main(String[] args) {
    int[] numbers=new int[5];
    for(int number:numbers){
        System.out.println(number);
    }
    changeArray(numbers);
        System.out.println(("after changeArray method"));
        for (int number:numbers
             ) {
            System.out.println(number);
        }
        int age=5;
        System.out.println("before changeAfter method"+ age);
      //  int newAge=changeArray(age);
       // System.out.println("after changeAge method"+newAge);
    }

    public static int[] changeArray(int [] numbers){
        numbers[0]=5;
        return numbers;
    }
    public static int changeAge(int age){
        age=10;
        return  age;
    }
}

