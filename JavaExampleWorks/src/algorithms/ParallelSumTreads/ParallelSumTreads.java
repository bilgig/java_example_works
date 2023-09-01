package algorithms.ParallelSumTreads;

public class ParallelSumTreads implements Runnable {

    @Override
    public void run() {

    }


    public synchronized int Sum(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
}


