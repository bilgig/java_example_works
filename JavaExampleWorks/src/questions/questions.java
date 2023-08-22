package questions;

import java.io.*;
import java.lang.reflect.Array;

public class questions {
    public static void main(String[] args) throws IOException {
        //BufferedWriter ve BufferedReader kullanılmalı.
        //try with resource kuralına uyulmalı
        //dosya varmı yokmu kontrolü yapılmalı.
        //Array içerisinde bulunan isimleri dosyaya yazan ve daha sonrasında bunları okuyup
        //başka bir array içerisine atan program

        File file=new File("file03.txt");
        String []arr={"Bilgi","Fatih","Gökay"};
        String filename="file03.txt";
        String [] newarr=new String[arr.length];
        if(!file.exists()){
            file.createNewFile();

        }
        System.out.println("buffered writer");
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filename))){
            for (String names:arr) {
                bufferedWriter.write(names);
                bufferedWriter.newLine();//alt alta yazar
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("buffered reader");
        try (BufferedReader reader = new BufferedReader(new
                FileReader(filename))) {
            String line;
            int i=0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                newarr[i]=line;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("newarr print");
        for(String name:newarr){
            System.out.println(name);
        }

    }
}
