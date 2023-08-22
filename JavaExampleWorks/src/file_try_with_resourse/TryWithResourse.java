package file_try_with_resourse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourse {
    public static void main(String[] args) {
        try(FileWriter fileWriter=new FileWriter("try-with.txt");BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)){
            bufferedWriter.write("hello");

        }catch (IOException e){
            e.printStackTrace();
        }
        //üstekinin kısa yazılımı. Kısaltılmış halidir.
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("try-with.txt"))){
            bufferedWriter.write("hello");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
