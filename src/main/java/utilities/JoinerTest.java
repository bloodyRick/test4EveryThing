package utilities;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JoinerTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Google", "Guava", "Scala");
        List<String> listWithNull = Arrays.asList("Google", "Guava", null);

        System.out.println(Joiner.on("#").join(list));
        System.out.println(Joiner.on("#").skipNulls().join(listWithNull));
        System.out.println(Joiner.on("#").useForNull("DEFAULT").join(listWithNull));
        System.out.println(Joiner.on("#").appendTo(new StringBuilder(),list));

//        String path = "/Users/woyuan/Documents/test.txt";
//        File file;
//        try (FileWriter fw = new FileWriter(new File(path))) {
//            System.out.println(Joiner.on("#").appendTo(fw,list));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(list.stream().collect(Collectors.joining("$")));

        List empty = Lists.newArrayList();
        List nullList = null;
        System.out.println(CollectionUtils.isEmpty(empty));
        System.out.println(CollectionUtils.isEmpty(nullList));

//        CharMatcher
    }
}
