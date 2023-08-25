package algorithms;

public class StairTriangleUp {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for(int j=i; j<10;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
