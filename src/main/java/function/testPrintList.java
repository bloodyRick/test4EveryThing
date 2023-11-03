package function;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2023/5/12
 */
public class testPrintList {
    public static void main(String[] args) {
        List<String> sss = Lists.newArrayList();
        sss.add("adsf");
        sss.add("fwe");
        sss.add("asdfs");
        sss.add("woauf");
        List<String> sq = sss.subList(0, sss.size());
        System.out.println(sq);
    }
}
