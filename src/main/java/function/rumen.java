package function;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2022/7/18
 */
public class rumen {
    public static void main(String[] args) {
        int a = 0;
        List<Boolean> batchResults = Lists.newArrayList();
//        batchResults.add(Boolean.TRUE);
        batchResults.add(Boolean.FALSE);
        batchResults.add(null);
        batchResults.add(null);
        System.out.println(batchResults.size());
        if (Lists.newArrayList(Boolean.TRUE).containsAll(batchResults)) {
            System.out.println("ok");
        }
    }
}
