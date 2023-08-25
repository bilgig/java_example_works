package lesson_studying;

public class AssignmentOperator {
    public static void main(String[] args) {
        byte byteNumber=126;
        short shortNumber=327;
        int intNumber=1058;
        long longNumber=12042L;
        float floatNumber=42.8f;
        double doubleNumber=8.58;
        char character='A';
        boolean booleanInformation=true;
        String courseName="Java";
        String helloText="Merhaba !", webWeb="bilgeada.com";
        helloText=helloText+webWeb;
        System.out.println(helloText+"\nByte Değeri:"+byteNumber+
                "\nShort Değeri:"+shortNumber+
                "\nInteger Değeri:"+intNumber+
                "\nLong Değeri:"+ longNumber+
                "\nFloat Değeri:"+floatNumber+
                "\nDouble Değeri:"+doubleNumber+
                "\nChar Değeri:"+character
                +"\nBoolean Değeri:"+booleanInformation);
        intNumber +=5;
        intNumber +=intNumber;//kendisi ile kendisini toplar, kendisine atar.
        System.out.println("İntNumber 1 "+ intNumber++);
        System.out.println("İntNumber 2 "+ (intNumber +=5));
        System.out.println("İntNumber 3 "+ (intNumber -=intNumber));
        System.out.println("İntNumber 4 "+ (intNumber *=intNumber));
        System.out.println("İntNumber 5 "+ (intNumber /=intNumber));
        System.out.println("İntNumber 6 "+ (intNumber %=2));
        System.out.println("İntNumber: 7 "+ intNumber);

    }
}
