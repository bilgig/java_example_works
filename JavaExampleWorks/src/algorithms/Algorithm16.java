package algorithms;

public class Algorithm16 {
    //Mükemmel sayı :Kendisi hariç bütün  pozitif bölenlerinin toplamı kendisine eşit olan sayılara denir.
    //1 ile 1000 arası mükemmel sayıların toplamı bulunuz.
    public static void main(String[] args) {

        int sayi = 1;
        while (sayi <= 1000) {
            int toplam = 0;
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0)
                    toplam += i;
            }

            if (toplam == sayi)
                System.out.println(sayi + " mükemmel bir sayidir");

            sayi++;
        }
    }
}

