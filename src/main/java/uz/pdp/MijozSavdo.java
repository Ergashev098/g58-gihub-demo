package uz.pdp;

/*
 * 5 ta mijoz
 * har bir uzogi 10 sekund savdo qiladi.
 * bizga shu 5 ta mijoz savdosini yakunlagandan keyin va birortasi
 * savdoni yakunlagandan keyin xabar bering
 * */

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MijozSavdo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> mijoz1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("🛒 1-mijoz savdoni boshladi...");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("✅ 1-mijoz savdoni tugatdi!");
            return "1-mijoz";
        });

        CompletableFuture<String> mijoz2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("🛒 2-mijoz savdoni boshladi...");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("✅ 2-mijoz savdoni tugatdi!");
            return "2-mijoz";
        });

        CompletableFuture<String> mijoz3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("🛒 3-mijoz savdoni boshladi...");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("✅ 3-mijoz savdoni tugatdi!");
            return "3-mijoz";
        });

        CompletableFuture<String> mijoz4 = CompletableFuture.supplyAsync(() -> {
            System.out.println("🛒 4-mijoz savdoni boshladi...");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("✅ 4-mijoz savdoni tugatdi!");
            return "4-mijoz";
        });

        CompletableFuture<String> mijoz5 = CompletableFuture.supplyAsync(() -> {
            System.out.println("🛒 5-mijoz savdoni boshladi...");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("✅ 5-mijoz savdoni tugatdi!");
            return "5-mijoz";
        });


        CompletableFuture<Void> anyOfExample = CompletableFuture.anyOf(
                mijoz1, mijoz2, mijoz3, mijoz4, mijoz5
        ).thenAccept(s ->
                System.out.println(" 🎉🎉🎉 birinchi savdoni tugatdi: " + s)
        );

        CompletableFuture<Void> allOfExample = CompletableFuture.allOf(
                mijoz1, mijoz2, mijoz3, mijoz4, mijoz5
        ).thenRun(() ->
                System.out.println("🎉🎉🎉 Barcha mijozlar savdoni tugatdi!")
        );

        Thread.sleep(12000);



    }
}
