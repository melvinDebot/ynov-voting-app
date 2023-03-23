package lamba;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var future = CompletableFuture.supplyAsync(()->1);
        future.thenAccept((result)-> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
