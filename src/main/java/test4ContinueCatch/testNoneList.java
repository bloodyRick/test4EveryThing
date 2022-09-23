package test4ContinueCatch;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2022/7/5
 */
public class testNoneList {
    public static void main(String[] args) {
        List<String> lll = Lists.newArrayList();
        lll.stream().forEach(System.out::println);
    }
}
