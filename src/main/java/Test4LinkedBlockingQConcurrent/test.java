package Test4LinkedBlockingQConcurrent;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author by woyuan  2023/1/18
 */
public class test {
    public static void main(String[] args) {
        Test4Concurrent t = new Test4Concurrent();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
         new Thread(() -> {
             try {
                 Thread.sleep(1000L);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             t.putQ(finalI);
            }).start();

            new Thread(() -> {
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    t.getQ();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

        }


    }
}
