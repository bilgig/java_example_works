package LessonStudying;

public class ForExample03 {
    public static void main(String[] args) {
        for(int i=0;i<=9;i++){
            System.out.println("birinci for ve i'nin değer: "+i);
            for(int j=0;j<=i;j++){
                //System.out.println("ikinci for ve j'nin değer: "+j);
                System.out.println("*");
            }
        }
    }
}
