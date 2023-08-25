package algorithms;

public class PrecedenceOperator2 {
    public static void main(String[] args) {
        int x=10, y=20,z=50;
        int islem=0;
        islem=x+ --y-++z;
        System.out.println("İslem sonucu"+islem);
    }
}
