package uz.pdp;


import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        int size = 5_000_000;
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }

        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            if(arr[i] > 0.2){
                count++;
            }
        }
        long end = System.currentTimeMillis();


        System.out.println(count);

//        int availableProcessorsCount = Runtime.getRuntime().availableProcessors();
//        System.out.println(availableProcessorsCount);
//
//        try(ForkJoinPool forkJoinPool = new ForkJoinPool(availableProcessorsCount - 1)){
//
//        }
    }
}