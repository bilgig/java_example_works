package file_examples.file_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExamples03 {
    public static void main(String[] args) throws IOException {
        String[] names = {"Bilgi ", "Fatih ", "Gökay"};
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileWriter = new FileWriter("fileWriterExamples01.txt", true);
            for (String isimler : names) {
                fileWriter.write(isimler);
                fileWriter.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }


        System.out.println("okuma işlemi");
        fileReader = new FileReader("fileWriterExamples01.txt");
        int character;
        while ((character = fileReader.read()) != -1) {
            System.out.print((char) character);
        }
        fileReader.close();
    }
}
