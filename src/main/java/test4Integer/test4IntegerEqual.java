package test4Integer;

import java.util.Objects;

/**
 * @author by woyuan  2022/11/15
 */
public class test4IntegerEqual {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        System.out.println(Objects.equals(a, b));
    }
}
