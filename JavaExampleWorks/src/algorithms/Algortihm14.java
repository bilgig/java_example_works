package algorithms;

public class Algortihm14 {
    //Aşağıda verilen dizideki sayıların for yada foreach kullanılarak toplamını ve ortalamasını hesaplayan kodu yazınız.
    public static void main(String[] args) {
    int [] numbers={2,-9,0,5,12,-25,22,9,8,12};
    int toplam=0;
    double ort=0;
    for(int i=0; i<numbers.length;i++){
        toplam+=numbers[i];
    }
        System.out.println("Toplamı: "+toplam);
        ort=(double)toplam/numbers.length;
        System.out.println("Ortalama:"+ort);
    }
}
