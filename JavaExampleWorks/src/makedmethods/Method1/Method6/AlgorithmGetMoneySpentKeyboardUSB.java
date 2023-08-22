package makedmethods.Method1.Method6;
/*Bir kişi, belirli bir bütçeyle satın alınabilecek en pahalı bilgisayar klavyesini ve USB sürücüsünü
belirlemek istiyor. Klavyeler ve USB sürücüler için fiyat listeleri ve bir bütçe verildiğinde, bunları
satın almanın maliyetini bulun. Her iki ürünü de satın almak mümkün değilse , iade edin.
Örnek
b=60;
keyboards=40,50,60
usb=5,8,12
getMoneySpent aşağıdaki parametrelere sahiptir:
int keyboards[n] : klavye fiyatları
int sürücüler[m] : sürücü fiyatları
int b : bütçe
İadeler
int: harcanabilecek maksimum değer veyaher iki ürünü de satın almak mümkün değilse
 */

public class AlgorithmGetMoneySpentKeyboardUSB {
    public static void main(String[] args) {
        int[] keyboard = {40, 50, 60};
        int[] usb = {5, 8, 12};
        int b = 60;

        System.out.println(getMoneySpent(keyboard, usb, b));

    }
        private static int getMoneySpent( int[] keyboard,int[] usb, int b){
            int[] prices = getPrices(keyboard, usb);
            int spent = -1;
            for (int price : prices) {
                if (price < b && spent < price) {
                    spent = price;
                }
            }
            return spent;
        }

            public static int[] getPrices ( int[] keyboard, int[] usb){
                int[] Value = new int[keyboard.length * usb.length];
                int indexCount = 0;
                for (int i = 0; i < keyboard.length; i++) {
                    for (int j = 0; j < usb.length; j++) {
                        Value[indexCount] = keyboard[i] + usb[j];
                        indexCount++;
                    }
                }
                return Value;
            }

        }

