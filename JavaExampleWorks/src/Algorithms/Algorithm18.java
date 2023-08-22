package Algorithms;

import java.util.Random;

public class Algorithm18 {
    public static void main(String[] args) {
        Random rastgele=new Random();
        int firstZar=0;
        int secondZar=0;
        int sayac=0;
        while(true){
            firstZar=rastgele.nextInt(6)+1;
            secondZar=rastgele.nextInt(6)+1;
            sayac++;
            System.out.println(sayac+".LessonStudying.deneme->"+"Birinci zar: "+firstZar+" "+"İkinci zar: "+secondZar);
            if(firstZar==6 && secondZar==6) {
                System.out.println("iki zar "+sayac+". denemede 6 geldi");
                break;
            }
        }
        System.out.println("while döngüsü kırıldı");
    }
}
