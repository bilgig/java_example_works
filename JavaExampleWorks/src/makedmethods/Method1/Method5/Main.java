package makedmethods.Method1.Method5;

import makedmethods.Method1.Method4.ArithmeticOperation;

public class Main {
    public static void main(String[] args) {
        /*Bir tane Main adında classım olsun. Bu class farklı bir pakette bulunan ve
         adı ArithmeticOperation classın sum metodunu new ile çağırsın ve
        iki sayıyı toplayıp geri dönsün.
        */
        /* Main classımın içerisinde bir divide metodum olsun bu metod 2 sayıyı bölüp sonucu bu metod içerisinde
        yazdırsın.*/
        /* Main classında bir tane helloWord adında metodum olsun ve ekrana helloWorld yazsın.
        Bu classa başka paket ve classlardan new ile üretmeden çağrılabilsin.*/

        ArithmeticOperation arithmeticOperation=new ArithmeticOperation();
        int number1=5;
        int number2=3;
        System.out.println(arithmeticOperation.sum(number1,number2));
        divide(number1,number2);
        helloWord();

    }
    private static void divide(int number1, int number2){
        System.out.println("Sonuç: " +(double)number1/number2);
    }
    public static void helloWord(){
        System.out.println("helloWorld");
    }
}
