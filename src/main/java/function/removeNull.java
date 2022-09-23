package function;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author by woyuan  2022/7/25
 */
public class removeNull {
    public static void main(String[] args) {
        List<String> batchIps = Lists.newArrayList();
        batchIps.add(null);
        batchIps.add(null);

        Iterables.removeIf(batchIps, Objects::isNull);

        System.out.println(CollectionUtils.isEmpty(batchIps));

    }
}
