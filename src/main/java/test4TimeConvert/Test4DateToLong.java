package test4TimeConvert;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2023/2/7
 */
public class Test4DateToLong {
    public static void main(String[] args) {
        String dateStr = "2023-01-01 00:00:00";
        long s = Timestamp.valueOf(dateStr).getTime();
        System.out.println(s);
        int a =5;
        System.out.println(a/4);

        List<Integer> b =Collections.emptyList();
        List<Integer> dddd = b.stream().map(e -> e + 1).collect(Collectors.toList());
        System.out.println(dddd);

        List<Integer> asdfasdf = Lists.newArrayList(1, 23, 123, 34, 12, 1, 2, 3, 31);
        List<Integer> dd = asdfasdf.stream().sorted().collect(Collectors.toList());
        System.out.println(dd);

        new Thread(() -> {
            System.out.println("new Thread 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
