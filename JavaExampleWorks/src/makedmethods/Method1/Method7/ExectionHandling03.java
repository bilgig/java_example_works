package makedmethods.Method1.Method7;

public class ExectionHandling03 {
    public static void main(String[] args) {
        String abc=null;

        try {
            //int sum=number/0;
            abc.concat("a");
            System.out.println("işlem başarılı");
        }catch (ArithmeticException exception) {
            System.out.println("catch ArithmeticException");
        }catch (NullPointerException exception){
            System.out.println("catch NullPointerException");
        }catch (Exception exception) {
            System.out.println("catche düştü");
        }finally {
            System.out.println("finally");
            System.out.println("connection kapatılıyor");
          }
        System.out.println("işlem tamamlandı");

    }
}
