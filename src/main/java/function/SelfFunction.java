package function;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2022/6/25
 */
public class SelfFunction {
    public static void main(String[] args) {
        List<String> list= Lists.newArrayList();
        list.add("werqw");
        list.add("dd");
        list.add("1sa");
        list.stream().filter(e->e.equals("dd"));
    }
}
