package lesson_studying;

public class StringEquals01 {
    public static void main(String[] args) {
        String username1=new String("name1");
        String username2=new String("name1") ;
        int number=5;
        int number2=5;
        sum(number);

        //imutable test string
      //  String username1="name1";
       // String username2= "name1";
        boolean isEquals=username1==username2;
        System.out.println(username1==username2);
        System.out.println(isEquals);
        boolean isEquals2=username1.equals(username2);
        System.out.println(isEquals2);

        //
    }
    public static void sum(int number){

    }


}
