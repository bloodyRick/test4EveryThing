package test4Consumer;

import java.util.function.Consumer;

/**
 * @author by woyuan  2022/10/20
 */
public class test4Consumer {
    public static void main(String[] args) {
        String str = "adfas";
        Consumer consumer = System.out::println;

        Consumer consumer1 = new ConsumerImpl();
        TwoNum twoNum = new TwoNum();
        twoNum.a = 1;
        twoNum.b = 2;
        print(consumer1, twoNum);

//        consumer1.andThen(consumer);
    }

    public static <T> void print(Consumer consumer, T t) {
        consumer.accept(t);
    }
}
