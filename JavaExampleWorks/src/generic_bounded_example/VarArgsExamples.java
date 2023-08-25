package generic_bounded_example;

public class VarArgsExamples {
    public static<T> void printArray(T... items){
        for(T item:items){
            System.out.println("item: "+item);
        }
    }

    public static void main(String[] args) {
        System.out.println("String dizisi: ");
        System.out.println("VarArgs");
        printArray("name1","name2","name3");
        printArray("name1","name2","name3","name4");
        printArray(1,2,3,4);
        printArray(1.5,2.5,3.5,4.5);
        System.out.println("Normal Method");
        printArray2("name1","name2");
    }
    public static <T> void printArray2(T data1,T data2){
        System.out.println("data1: "+data1+"data2: "+data2);
    }
}
