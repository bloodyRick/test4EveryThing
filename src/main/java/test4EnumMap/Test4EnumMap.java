package test4EnumMap;

import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author by woyuan  2023/3/12
 */
public class Test4EnumMap {
    public static void main(String[] args) {
        List<Plant.LifeCycle> ddd;
        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

    }
}
