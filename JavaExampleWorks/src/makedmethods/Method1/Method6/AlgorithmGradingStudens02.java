package makedmethods.Method1.Method6;
/*HackerLand Üniversitesi aşağıdaki derecelendirme politikasına sahiptir:
73, 67, 38, 33, 28, 79, 81,98 notların yuvarlanması işlemi yapılır.
Herhangidaha 40 dan az başarısız bir nottur ve aynı not alınır.
Sam, üniversitede bir profesördür ve her öğrencininbu kurallara göre:
arasındaki fark 3den az ise bir sonraki 5 katına yuvarlanır. 3 ve 3 den çok ise yuvarlanmaz aynı alınır.
eğer değeri 38den daha az, sonuç yine başarısız bir not olacağından yuvarlama yapılmaz.
örnekler:
yuvarlak(85 - 84, 3'ten küçüktür, yuvarlanır)
yuvarlama (sonuç 40'tan küçüktür, yuvarlanmaz, aynı alınır.)
yuvarlama (60 - 57, 3 veya daha yüksektir, yuvarlanmaz aynı alınır.)
İşlev Açıklama
GradingStudents metodu yazılarak kod yazılacaktır. */

public class AlgorithmGradingStudens02 {
    public static void main(String[] args) {
        int[] grades = {73, 67, 38, 33, 28, 79, 81,98};

       gradingStudens(grades);
        for(int num : grades) {
            System.out.println(num);
        }

    }

    public static int[] gradingStudens(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {

            } else {
                    int nextValue=getRound(grades[i], 5);
                if (nextValue-grades[i]<3) {
                    grades[i]=nextValue;
                }
            }
        }
        return grades;
    }
    public static int getRound(double grade, int nextMultiple){
        return (int)(Math.ceil(grade/nextMultiple)*nextMultiple);
    }
}
