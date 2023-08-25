package method_examples.Method7;

public class ExectionHandling01 {
    public static void main(String[] args) {
        int number=5;
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
        }
        System.out.println("işlem tamamlandı");
    }
}
