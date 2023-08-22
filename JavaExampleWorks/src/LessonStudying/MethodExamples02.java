package LessonStudying;

public class MethodExamples02 {
    public static void main(String[] args) {
    int number1=5, number2=10;
        //int toplam=number1+number2;
        //System.out.println("toplam: "+toplam);
       // toplaVoid(number1,number2);
        int toplam=(int)toplaRetun(number1,number2);
        System.out.println(toplam);
    }
    static void toplaVoid(int number1, int number2){
        int toplam=number1+number2;
        System.out.println("toplam: "+toplam);
    }
    static double toplaRetun(int number1, int number2){
/*        int toplam=number1+number2;
        return toplam;*/
        return number1+number2;

    }
}
