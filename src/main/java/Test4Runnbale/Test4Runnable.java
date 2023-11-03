package Test4Runnbale;

import com.google.common.collect.Lists;
import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static Test4Runnbale.Test4Runnable.submitTask;

/**
 * @author by woyuan  2023/3/1
 */
public class Test4Runnable {
    static ExecutorService s = Executors.newFixedThreadPool(2000);

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(6);
        TaskTest t1 = new TaskTest();
        TaskTest t2 = new TaskTest();
        TaskTest t3 = new TaskTest();
        TaskTest t4 = new TaskTest();
        TaskTest t5 = new TaskTest();
        TaskTest t6 = new TaskTest();
        List<Runnable> dd = Lists.newArrayList();

        dd.add(t1);
        dd.add(t2);
        dd.add(t3);
        dd.add(t4);
        dd.add(t5);
        dd.add(t6);
        s.execute(()-> Test4Runnable.submitTask(latch,dd));

    }

    @SneakyThrows
    public static void submitTask(CountDownLatch latch, List<Runnable> tasks){
        System.out.println(System.currentTimeMillis());
        for (Runnable task : tasks) {
            s.execute(() ->{
                System.out.println("start");
                task.run();
                System.out.println(latch.getCount());
                latch.countDown();
            });
        }

        latch.await();
        System.out.println(System.currentTimeMillis());
        System.out.println("run complete");
    }
}
