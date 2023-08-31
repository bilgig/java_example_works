package threads.thread01;

import java.util.List;

public class Student implements Runnable{
    private final int studentId;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void run() {
        //Öğrenci notları hesaplanır.
        double[] grades=generateRandomGrades();
        //Not ortalaması hesaplanır.
        double averangeGrades=calcAverange(grades);

        System.out.println("Student "+studentId+ ": Grades:"+gradesToString(grades));
    }
    //random değerler 100 ile çarpılarak 5 not bilgi alınır.
    private double[] generateRandomGrades(){
        double[] grades=new double[5];
        for(int i=0;i<5;i++){
            grades[i]=Math.random()*100;
        }
        return grades;
    }

    private double calcAverange(double[] grades){
        double sum=0;
        for(double grade:grades){
            sum+=grade;
        }
        return sum / grades.length;
    }

    private String gradesToString(double[] grades){
        StringBuilder stringBuilder=new StringBuilder();
        for(double grade:grades){
            stringBuilder.append(grade).append(" ");
        }
        return stringBuilder.toString();
    }



}
