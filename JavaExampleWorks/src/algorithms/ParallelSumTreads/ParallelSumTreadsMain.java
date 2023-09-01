package algorithms.ParallelSumTreads;

import java.util.concurrent.atomic.AtomicInteger;

public class ParallelSumTreadsMain {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        AtomicInteger sum1= new AtomicInteger();
        AtomicInteger sum2= new AtomicInteger();
        ParallelSumTreads parallelSumTreads=new ParallelSumTreads();


        Thread thread1 = new Thread(() -> {
                sum1.set(parallelSumTreads.Sum(array1));

        });
        Thread thread2=new Thread(()-> {
               sum2.set(parallelSumTreads.Sum(array2));

        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Toplam: "+sum1.addAndGet(sum2.get()));


    }
}
