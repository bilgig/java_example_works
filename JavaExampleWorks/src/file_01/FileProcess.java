package file_01;

import java.io.File;
import java.io.IOException;

public class FileProcess {
    public static void main(String[] args) throws IOException {
        File directory=new File("examples");
        boolean bool=directory.mkdir();
        File file=new File(directory, "file");
        bool=file.createNewFile();
        System.out.println("file&folder delete");
        file.delete();
        directory.delete();
    }
}
