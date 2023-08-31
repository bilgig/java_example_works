package threads.thread01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudentMain {
    public static void main(String[] args) {
        int numberOfStudent=100;
        //Asenkron işler çalıştırmamızı kolaylaştıran JDK tarafından sunulan bir interface'dir.Thread havuzu oluşturur.
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int studentId=1; studentId<=numberOfStudent;studentId++){
            Runnable student=new Student(studentId);
            //Execute metodu sadece Runnable tipinden bir iş alır ve doğal olarak bir geriye değer döndürmez.
            executorService.execute(student);
        }
        //Bu metod ile ExecutorService içerisinde bulunan işlerin bitmesi beklenir ve başka iş alınmaz. Beklenen işler bittiğinde ThreadPool yokedilir.
            executorService.shutdown();
    }
}
