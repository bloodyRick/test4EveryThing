package Test4AddAll;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author by woyuan  2023/3/20
 */
public class TestJion {
    public static void main(String[] args) {
        List<String> da = Lists.newArrayList();
        String sss = StringUtils.join(da.subList(0, 0), ",");
        System.out.println(sss);
    }
}
