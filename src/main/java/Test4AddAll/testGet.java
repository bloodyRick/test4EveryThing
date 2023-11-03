package Test4AddAll;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author by woyuan  2023/3/10
 */
public class testGet {
    public static void main(String[] args) {
        List<String> dd = Lists.newArrayList();
        dd.add("asfdas");
        dd.add("sdfas");
//        System.out.println(dd.get(dd.size() - 1));

        List<String> dafd = Lists.newArrayList();
        System.out.println(CollectionUtils.isEmpty(dafd));

    }
}
