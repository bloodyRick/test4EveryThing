package testCountDownLatch;

/**
 * @author by woyuan  2022/9/30
 */
public class test4ThreadClassyinyong {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();

        Runnable r = a::add;
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        Thread.sleep(1000L);
        System.out.println(a.sum);

    }

    public static class A {

        int sum=0;
        public void add() {
            sum+=1;
        }
    }
}
