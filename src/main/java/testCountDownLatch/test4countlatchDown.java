package testCountDownLatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author by woyuan  2022/8/17
 */
public class test4countlatchDown {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable runnable = () -> {
            System.out.println("testThread"+ System.currentTimeMillis());
            latch.countDown();
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
//        latch.await(5, TimeUnit.SECONDS);
        latch.await();
        System.out.println("mainThread" + System.currentTimeMillis());

    }
}
