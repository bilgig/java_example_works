package makedmethods.Method1.Method7;

public class test {
    public static void main(String[] args) {
        int number = 5;
        String abc = null;
        try{
// abcconcat("a");
            int sum = number /0;
            System.out.println("İşlem Başarılı");
        }catch (ArithmeticException exception){
            System.out.println("catch ArithmeticException");
        }catch (NullPointerException exception){
            System.out.println("catch NullPointerException");
        }catch (Exception exception){
            System.out.println("catch Exception");
        }finally {
            System.out.println("finally");
            System.out.println("connection kapatılıyor.");
        }

        System.out.println("İşlem Tamamlandı.");

    }

}

