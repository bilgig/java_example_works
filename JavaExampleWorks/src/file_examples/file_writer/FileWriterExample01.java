package file_examples.file_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("fileWriter.txt",true);//yanına ekleme yapması için true
            fileWriter.write("merhaba file ");
            fileWriter.write("abc");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("abc");
            fileWriter.write("\r\n");
            fileWriter.write("netLineee");
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            fileWriter.close();
        }
        FileReader fileReader=new FileReader("fileWriter.txt");
        int i;
        while((i=fileReader.read())!=-1){
            System.out.println((char)i);
        }
        fileReader.close();

    }
}
