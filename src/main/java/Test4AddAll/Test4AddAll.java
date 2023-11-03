package Test4AddAll;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author by woyuan  2023/3/2
 */
public class Test4AddAll {
    public static void main(String[] args) {
        List<String> dd = Lists.newArrayList("23","q2","12adf");
        List<String> dd2 = Lists.newArrayList("23","q2","12adf");
        dd.addAll(dd2);
        System.out.println(dd);

        Map<String, Integer> dasdf = Maps.newHashMap();
        System.out.println(dasdf.values());
//        Integer max = Collections.max(Lists.newArrayList(dasdf.values()));
//        System.out.println(max);
        System.out.println(CollectionUtils.isEmpty(dasdf.values()));

    }
}
