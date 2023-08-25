package lesson_studying;

public class ArrayExample02 {
    public static void main(String[] args) {
    int[] age={12,4,5,2,5};
    int[] age2=new int[5];
    System.out.println(age2[0]);
    age2[0]=5;
    System.out.println(age2[0]);
        System.out.println("with for loop priting");
        for(int i=0; i<age.length;i++){
            System.out.println(age[i]);
        }
        System.out.println("with foreach loop printing");
        for(int element:age){
            System.out.println(element);
        }

        }
    }

