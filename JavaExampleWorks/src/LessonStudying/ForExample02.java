package LessonStudying;

public class ForExample02 {
    public static void main(String[] args) {
        //Wile döngüsü
        System.out.println("While döngüsü başlıyor.");
        int startValue=0;
        while(startValue<=0){
            System.out.println(startValue);
            startValue++;
        }
        System.out.println("While döngüsü bitti.");
        System.out.println("For döngüsü başlıyor.");
//
        for(int i=0;i<=10;i++){
            System.out.println(i+"For döngüsü bitti.");
        }

    }
}
