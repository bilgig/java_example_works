package design_pattern_examples.prototype_design_pattern;
/*
Prototype Design Pattern, creational dizayn patternlerinden biridir.
Aynı sınıftan üretilecek olan ve pek çok ortak özelliği bulunan benzer nesnelerin
üretimi sırasında gerçekleşebilecek karışıklıkları engellemek ve üretim maliyetini azaltmak
amacı ile kullanılır.

*/
/* Prototype Design Pattern da  yeni bir nesne oluşturmak yerine ortak ve benzer özelliklere sahip
mevcut bir nesne kopyalanmaktadır. Mevcut nesnelerden bir nesne oluşturmanın en iyi yollarından biri
clone() yöntemidir. Nesne klonlama işlemini gerçekleştirebilmek adına Cloneable Interface’i implement edilir
ve clone metodu override edilir.
*/

/*
Her defasında yeni renk nesnesi yaratmak yerine var olan renk nesneleri klonlanır.
*/


public class Main {
    public static void main(String[] args){
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
    }
}
