package LessonStudying;

import algorithms.AccessStaticMethodDivide;

public class MetodStaticExamples01 {
    public static void main(String[] args) {
        int resultDivide=MethosStaticMethod02.divide(10,2);
        System.out.println(resultDivide);
        int resultDivide2= AccessStaticMethodDivide.divide(6,2);
        System.out.println(resultDivide);
        int toplam=sum(5,10);
        System.out.println(toplam);

    }
    public static  int sum(int number1, int number2){
        return number1+number2;
    }
}
