package test4Split;

import java.util.Arrays;
import java.util.List;

/**
 * @author by woyuan  2023/4/12
 */
public class test4Split {
    public static void main(String[] args) {
        String split = "/";
        String in = "/a/b/c/d/d,";
        System.out.println(in.startsWith(split));
        List<String> out = Arrays.asList(in.split(split));
        out.forEach(System.out::println);
    }
}
