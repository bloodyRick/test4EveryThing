package Test4TreeMap;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
enum TimeSeriesName {
    PUBLISHED("published", "本次发布"),
    LAST_PUBLISHED("last_published", "上次发布"),
    ONE_DAY_AGO("one_day_ago", "发布前24小时"),
    WAITING_PUBLISHING("waiting_publish", "未发布组");

    private final String name;
    private final String desc;
}

/**
 * @author by woyuan  2023/4/4
 */
public class test4TreeMap {

    public static final Long MINUTE_MILL_SECOND = 60 * 1000L;

    public static void main(String[] args) {
        Map<Long, Integer> result = Maps.newTreeMap();

        Long startTs = 1680591000000L;
        Long endTs = 1680591279123L;

        int dotCount = (int) ((endTs / (MINUTE_MILL_SECOND)) - startTs / (MINUTE_MILL_SECOND));
        for (int i = 0; i < dotCount; i++) {
            result.put(TimeUnit.MILLISECONDS.toMinutes(startTs) * MINUTE_MILL_SECOND + i * MINUTE_MILL_SECOND, 0);

        }

        List<Integer> total = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> ss = total.stream().parallel().sorted(Comparator.comparingInt(o -> o)).collect(Collectors.toList());
        System.out.println(ss);

        total = total.subList(0, 3);

        String dadsfa = "sfas_212";
        System.out.println(Long.valueOf(dadsfa.split("_")[1]));

        List<String> sss = Lists.newArrayList();
        sss.add("dadsfa");
        System.out.println(sss);

        System.out.println();

        for (TimeSeriesName value : TimeSeriesName.values()) {
            System.out.println(value.getName());
        }
    }
}

