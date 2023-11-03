package guavaListTeset;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2023/1/17
 */
public class test4addAll {
    public static void main(String[] args) {
        List<String> result = Lists.newArrayList();

        List<String> a1 = Lists.newArrayList();
        a1.add("sdf");
        a1.add("sd");
        a1.add("sq3e");
        a1.add("sdqe1");

        List<String> a2 = Lists.newArrayList();
        a2.add("sdf");
        a2.add("ssdfadf");
        a2.add("sd");
        a2.add("sdafdf");
        a2.add("sdf");

        result.addAll(a1);
        result.addAll(a2);

        List<String> resultssss = result.stream().distinct().collect(Collectors.toList());
        System.out.println(resultssss);
    }
}
