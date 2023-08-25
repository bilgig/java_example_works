package lesson_studying;

public class IfElseStatements {
    public static void main(String[] args) {
      String subjectName="CSharp";
      String courseName="java";
      if(!subjectName.equals(courseName)){
          System.out.println("doğru derstesiniz");
      }else {
          System.out.println("yanlış ders seçimidir.Bizim dersimiz "+courseName);
      }

    }
}
