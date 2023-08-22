package makedmethods.Method1.Method8;

public class NullPointerExceptionAppoaches {
    public static void main(String[] args) {
        String name=null;//bu obje nulldır.
        String name2="null";//bu obje stirng ifadedir. Null değildir.

/*        try {
            //int sum=number/0;
            name.concat("a");
            System.out.println("işlem başarılı");
        }catch (NullPointerException exception) {
            System.out.println("catch NullPointerException");
        }*/

        if(name!=null){
            name=name.concat("welcome");
            System.out.println(name);

        }
        System.out.println("finish line");
    }
}
