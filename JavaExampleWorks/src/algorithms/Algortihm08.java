package algorithms;

public class Algortihm08 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;//asay sayilar iki den baslar
        while(count<50){ // ilk 50
            boolean isPrime = true;
            for (int i = 2; i < num; i++) { //herhangi bir sayiya bolunebiliyor mu
                if (num % i == 0) { //Bolunebiliyorsa asal degildir
                    isPrime = false;
                }
            }

            if(isPrime) {
                count++;
                if(count%10==0) { //10 tane yazdirildiysa alt satira gec
                    System.out.println(num);
                } else {
                    System.out.println(num + " ");
                }
            }
            num++;
        }
    }
}

