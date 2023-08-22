package class_examples;

public class Main {
    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.age=10;
        myDog.color="blue";
        myDog.isHealty=true;
        myDog.findAge();
        System.out.println("is my dog healty?: "+myDog.isHealty);
        System.out.println("dads dog");
        Dog dadsDog=new Dog();
        dadsDog.findAge();
        System.out.println("is dads dog healty?: "+dadsDog.isHealty);


    }
}
