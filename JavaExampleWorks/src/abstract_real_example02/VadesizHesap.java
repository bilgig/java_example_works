package abstract_real_example02;

public class VadesizHesap extends Hesap{

    public VadesizHesap(double bakiye, String hesapNo ) {
     this.bakiye=bakiye;
     this.hesapNo=hesapNo;
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
}
