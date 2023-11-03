package test4NewInterface;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * @author by woyuan  2023/2/23
 */
public class Test {
    public static void main(String[] args) {
        TestInterface[] in;
        in = new TestInterface[4];
        Map<String, Double> leftAvgMap = Maps.newHashMap();
        leftAvgMap.put("d", 12D);
        System.out.println(leftAvgMap);

        List<Integer> ddd = Lists.newArrayList();
        ddd.add(1);
        ddd.add(2);
        ddd.add(3);
        ddd.add(4);
        ddd.remove(ddd.size() - 1);
        System.out.println(ddd);
    }
}
