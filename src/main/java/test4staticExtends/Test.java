package test4staticExtends;

import JsonTest.PostCheckMafkaMsg;

import java.util.Objects;

/**
 * @author by woyuan  2022/9/23
 */
public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getInt());

        Integer d = 10;
        Integer d1 = 10;
        System.out.println(Objects.equals(d, d1));
        System.out.println(d == d1);
        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(d1));
    }
}
