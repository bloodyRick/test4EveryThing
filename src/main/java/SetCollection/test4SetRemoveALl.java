package SetCollection;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @author by woyuan  2022/8/10
 */
public class test4SetRemoveALl {
    public static void main(String[] args) {
        Set<String> set1 = Sets.newHashSet();
        Set<String> set2 = Sets.newHashSet();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");

        set2.add("1");
        set2.add("2");

        set1.removeAll(set2);
        System.out.println(set1);
    }
}
