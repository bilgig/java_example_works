package abstract_examples.abstract_example01;
/*
Sen bir banka yazılım geliştiricisisin ve müşterilerin banka hesaplarını yöneten bir sistem geliştiriyorsun.
Bankanın müşterileri bireyler ve şirketlerdir. Her müşteri için farklı türde hesaplar
(örneğin vadesiz hesap, birikim hesabı, kredi hesabı) açılabilir.
Bireyler ve şirketler için ortak bazı işlemler de vardır, ancak hesap türlerine göre farklı işlemler de gerçekleşir.

Bu senaryoya uygun olarak, Java dilinde bir sınıf yapısı oluşturarak müşterilerin banka hesaplarını yönetmek için
kullanabileceğin bir taslağı göstermeni istiyorum.
Bu sınıflarda müşterilerin hesaplarına para yatırma, para çekme ve bakiye sorgulama gibi temel işlemleri de
gerçekleştirmen gerekmektedir.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Musteri musteri=new Musteri("Ayşe", Arrays.asList(123456789).toArray(new String[0]));
        Hesap vadesizHesap=new VadesizHesap(1000000,"123456789");
        vadesizHesap.paraCek(5000);

    }

    }


