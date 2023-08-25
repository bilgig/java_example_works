package lesson_studying;

public class ReturnExamples01 {
    public static void main(String[] args) {
        System.out.println(findFirs());
    }
    public static int findFirs() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                return 4;
            }
        }
        return -1;
    }
}
