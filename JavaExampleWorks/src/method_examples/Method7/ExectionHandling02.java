package method_examples.Method7;

public class ExectionHandling02 {
    public static void main(String[] args) {

    String abc=null;

        try {
        //int sum=number/0;
        abc.concat("a");
        System.out.println("işlem başarılı");
        }finally {
            System.out.println("finally");
        }
        System.out.println("işlem tamamlandı");
}

}