package function;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2023/4/19
 */
public class testList {
    public static void main(String[] args) {
        List<Integer> a = Lists.newArrayList(1,2,3,4,5,6,7);
        List<Integer> b = a.stream().filter(e -> e == 8).map(e->e+1).collect(Collectors.toList());
        System.out.println(a);
        System.out.println(b);


    }
}
