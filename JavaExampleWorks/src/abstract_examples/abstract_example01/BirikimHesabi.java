package abstract_examples.abstract_example01;

public class BirikimHesabi extends Hesap{
    double faizOrani;
    public BirikimHesabi(double bakiye, String hesapNo,double faizOrani) {
        this.bakiye=bakiye;
        this.hesapNo=hesapNo;
        this.faizOrani=faizOrani;
    }

    @Override
    public void paraCek(double miktar) {
        bakiye=bakiye-miktar;
        System.out.println("Kullanıcının son bakiyesi: "+bakiye);
    }

    @Override
    public void paraYatir(double miktar) {
        bakiye=bakiye+miktar;
        System.out.println("Kullanıcının son bakiyesi: "+ bakiye);
    }
    public void faizOraniHesapla(){
    bakiye=(bakiye*faizOrani)+bakiye;
        System.out.println("Kullanıcının son bakiyesi: "+bakiye);
    }

}
