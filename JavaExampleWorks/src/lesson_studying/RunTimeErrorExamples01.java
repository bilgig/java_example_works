package lesson_studying;

public class RunTimeErrorExamples01
{
    public static void main(String[] args) {
        int [] array=new int[3];//eleman sayısı
        boolean is=array[1]<10;
        array[2]=20;
        System.out.println(array[1]);

    }
}
