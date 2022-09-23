package function;

import java.util.function.Consumer;

/**
 * @author by woyuan  2022/6/30
 */
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = e -> System.out.println(e);
        Consumer<String> consumer1 = e->{};
        consumer1.accept("hahahhh");
        String dd = "dasd";
        System.out.println(Boolean.parseBoolean(dd));
    }
}
