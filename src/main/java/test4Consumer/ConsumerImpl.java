package test4Consumer;

import java.util.function.Consumer;

/**
 * @author by woyuan  2022/10/20
 */
public class ConsumerImpl implements Consumer {
    @Override
    public void accept(Object o) {
        TwoNum twoNum = (TwoNum) o;
        int a = twoNum.a;
        int b = twoNum.b;
        System.out.println(a+b);
    }

}
