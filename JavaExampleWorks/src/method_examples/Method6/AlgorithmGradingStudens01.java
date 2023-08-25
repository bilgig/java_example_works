package method_examples.Method6;
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

public class AlgorithmGradingStudens01 {
    public static void main(String[] args) {
        int[] numbers = {73, 67, 38, 33, 28, 79, 81,98};

        int sonuc[] = gradingStudens(numbers);
        for(int num : sonuc) {
            System.out.println(num);
        }

    }

    public static int[] gradingStudens(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 38) {

            } else {
                int numberAdd1 = numbers[i] + 1;
                int numberAdd2 = numbers[i] + 2;
                if (numberAdd1 % 5 == 0) {
                    numbers[i] = numberAdd1;
                } else if (numberAdd2 % 5 == 0) {
                    numbers[i] = numberAdd2;
                } else {
                    numbers[i] = numbers[i];
                }

            }
        }
        return numbers;
    }

}
