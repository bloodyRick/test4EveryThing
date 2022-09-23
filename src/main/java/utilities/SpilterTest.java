package utilities;

import com.google.common.base.Splitter;

import java.util.regex.Pattern;

public class SpilterTest {
    public static void main(String[] args) {
        Splitter.on("|").omitEmptyStrings().trimResults().splitToList("go | de|e de |||").forEach(System.out::println);
        System.out.println(Splitter.on("|").splitToList("go|de|ede|||").size());
        System.out.println(Splitter.on("|").omitEmptyStrings().splitToList("go|de|ede|||").size());
        Splitter.fixedLength(3).splitToList("aaabbbcccc").forEach(System.out::println);
        System.out.println(Splitter.on("#").limit(3).splitToList("hello#world#dfeee#dfadeee#scala"));
        System.out.println(Splitter.on(Pattern.compile("\\|")).splitToList("hello|world"));
        System.out.println(Splitter.onPattern("\\|").withKeyValueSeparator("=").split("hello=HELLO|world=WORLD"));
    }
}
