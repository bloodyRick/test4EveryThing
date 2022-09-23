package function;

import com.google.common.collect.Lists;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author by woyuan  2022/7/6
 */
public class test4ParallalStream {
    public static void main(String[] args) {
        List<Integer> kkk = Lists.newArrayList();
//        kkk.parallelStream().forEach(e->{
//            try {
//                System.out.println(e+"start");
//                Thread.sleep(3000);
//                System.out.println(e+"end");
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        });

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("adsfa");
        })
//                .submit(new Runnable() {
//
//            @Override
//            public void run() {
//
//                            try {
//                System.out.println(Thread.currentThread().getName()+"start");
//                Thread.sleep(3000);
//                System.out.println(Thread.currentThread().getName()+"end");
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//            }
//        }
//        )
                ;


        for (int i = 0; i < 10; i++) {
            kkk.add(i);
//            service.submit();
        }


        System.out.println("main thread end");

    }
}
