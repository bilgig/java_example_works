package class_examples.objects;

import class_examples.MainCustomer;

public class Main {
    static void myStaticMethod(){
        System.out.println("static method,object üretilmeden çağrılabilir.");
    }
    public void myPublicMethod(){
        System.out.println("public method, yalnız obje üretilip çağrılarak ulaşılabilir.");
    }

    public static void main(String[] args) {
        myStaticMethod();
        Main main=new Main();
        main.myPublicMethod();

    }



}
