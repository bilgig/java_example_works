package lesson_studying;

public class TypeCasting2 {
    public static void main(String[] args) {

        float floatDollar=13.5f;
        int intDollar= (int) floatDollar;
        long longDollar=24;
        System.out.println("intDollar:  "+ intDollar);
        int intDollar2= (int) longDollar;
        String number1="5";
        int sum= Integer.parseInt(number1)+5;
        String sum2= String.valueOf(sum);
    }
}
