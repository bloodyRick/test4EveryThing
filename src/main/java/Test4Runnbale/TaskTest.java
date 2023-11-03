package Test4Runnbale;

import lombok.SneakyThrows;

/**
 * @author by woyuan  2023/3/1
 */
public class TaskTest implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
//        Thread.sleep(1000L);
        System.out.println(Thread.currentThread().getName());
    }
}
