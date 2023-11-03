package guavaListTeset;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by woyuan  2023/2/20
 */
public class testListRemove {
    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.remove(0);
        list.remove(1);
        System.out.println(list);

        list.sort((o1, o2) -> o2 - o1);
        System.out.println(list);
    }
}
