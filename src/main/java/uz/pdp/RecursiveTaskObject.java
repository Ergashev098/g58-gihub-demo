package uz.pdp;

import java.util.concurrent.RecursiveTask;

public class RecursiveTaskObject extends RecursiveTask<Integer> {
    private int[] numbers;
    private int from;
    private int to;
    private static int limit = 1000;

    public RecursiveTaskObject(int[] numbers, int from, int to) {
        this.numbers = numbers;
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {

        if((to - from) < limit){
            int count = 0;
            for (int i = 0; i < to; i++) {
                if(numbers[i] > 0.2){
                    count++;
                }
            }
            return count;
        }else {
            int middle = from + (to - from) / 2;
            RecursiveTaskObject r1 = new RecursiveTaskObject(numbers, from , middle);
            RecursiveTaskObject r2 = new RecursiveTaskObject(numbers, middle , to);
        }

        return 0;
    }
}
