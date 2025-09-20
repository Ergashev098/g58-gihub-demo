package uz.pdp;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args)throws ExecutionException,InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(()->{

            System.out.println(Thread.currentThread());
            return "Hellpo, G58, Asynchrone";

        }).thenApply(s -> s + "Programming")
          .thenAccept(s->{
              System.out.println(s);
          })
          .thenRun(()->{
              System.out.println("CompletableFuture is over..");
          });

        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(()->{
            System.out.println(Thread.currentThread());

        });
        Thread.sleep(500);


    }
}
