package LessonStudying;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mindNumber = 0;
        int usersMindNumber = 5;
        int sayac=0;
        System.out.println("aklimdaki tuttuğum sayıyı bulabilirmisin?");
        while (true) {
            System.out.println("Haydi bir tahmin");
            usersMindNumber = scanner.nextInt();
            sayac++;
            if (mindNumber == usersMindNumber) {
                break;
            }
        }
        System.out.println("eveet aklımdaki sayı:5 di");
    }

}
