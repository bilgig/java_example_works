package lesson_studying;

public class DoWhileExample01 {
    public static void main(String[] args) {
        int startValue=0;
        do{
            System.out.println("do keywordün içerisindeyim: "+ startValue);
            startValue++;
        }while(startValue<5);
    }
}
