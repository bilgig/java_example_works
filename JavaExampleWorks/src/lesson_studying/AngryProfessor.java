package lesson_studying;

public class AngryProfessor {
        public static void main(String[] args) {
            int n=5;
            int k=3;
            int [] a={2, -1, 0, 1, 2};
            int sayac=0;
            for (int time:a) {
                if(time<=0){
                    sayac++;
                }
            }
            if(sayac>=k) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }

