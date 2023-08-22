package makedmethods.Method1.Method8;

import java.io.FileWriter;
import java.io.IOException;

public class ChechkedExceptionExample01 {
    public static void main(String[] args)/* throws IOException*/ {
        try {
            FileWriter fileWriter=new FileWriter("file.txt");
            /*fileWriter.append("sadsad");
            fileWriter.flush();*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("checkedExceptionExample01 devam ediyor");
    }
}
