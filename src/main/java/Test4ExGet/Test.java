package Test4ExGet;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author by woyuan  2023/12/20
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2
//                , 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
//        executor.submit(() -> {
//            System.out.println("hah ");
//        });
        CompletableFuture results = CompletableFuture.runAsync(() -> {

//            try {
//                Thread.sleep(1000000L);
                throwM();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

        });
        CompletableFuture<Void> f = CompletableFuture.allOf(results);

        f.join();

        try {
            System.out.println(results.get());


        } catch (RuntimeException | ExecutionException e) {
            System.out.println(e);
        }
    }

    public static boolean throwM() {
        throw new RuntimeException("test");
    }
}
