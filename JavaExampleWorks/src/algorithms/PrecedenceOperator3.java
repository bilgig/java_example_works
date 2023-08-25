package algorithms;

public class PrecedenceOperator3 {
    public static void main(String[] args) {
        int x=2, y=3,z=4;
        int islem=0;
        islem=++x + ++y+5<<1|2;
        System.out.println("İslem sonucu "+islem);
    }
}
