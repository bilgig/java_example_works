package LessonStudying;

public class NestedForExample03 {
    public static void main(String[] args) {
        for(int i=10;0<i;i--){
            for(int j=i; j<10;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
