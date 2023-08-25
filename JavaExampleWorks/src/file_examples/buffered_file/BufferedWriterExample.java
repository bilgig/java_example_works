package file_examples.buffered_file;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        String fileName="C://Users/user/Desktop/file/testfile/fileWriter02.txt";
        FileWriter fileWriter=new FileWriter(fileName,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("hello");
        bufferedWriter.newLine();//alta iniyor
        bufferedWriter.write("world");
       // fileWriter.close();
        bufferedWriter.close();


        FileReader fileReader=new FileReader(fileName);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String data;
        while ((data=bufferedReader.readLine())!=null){
            System.out.println(data);
        }
        fileReader.close();
        bufferedReader.close();

    }
}
