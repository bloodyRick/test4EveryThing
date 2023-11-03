package Test4LinkedBlockingQConcurrent;

import org.springframework.util.CollectionUtils;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author by woyuan  2018
 */
public class Test4Concurrent {
    Queue<Integer> q;
    Object getLock;
    Object putLock;

    public Test4Concurrent() {

        q = new LinkedBlockingQueue<>(Integer.MAX_VALUE);
    }

    public synchronized void getQ() throws InterruptedException {
        if (CollectionUtils.isEmpty(q)) {
            Thread.sleep(1000L);
        }
        Integer i = q.remove();
        System.out.println("get" + i);
    }

    public synchronized void putQ(Integer v) {

        q.add(v);
        System.out.println("put" + v);
    }


}
