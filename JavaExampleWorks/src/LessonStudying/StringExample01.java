package LessonStudying;

public class StringExample01 {
    public static void main(String[] args) {
        //imutable test string
        String username="java";
        String classname="dersi";
        System.out.println(username.concat("dersi").concat("başlıyor."));
        String username2="java"+"dersi";
        username=username.concat(classname);
        System.out.println(username);
        //
    }


}
