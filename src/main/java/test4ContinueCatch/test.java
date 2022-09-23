package test4ContinueCatch;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomUtils;

import java.util.List;
import java.util.Random;

/**
 * @author by woyuan  2022/7/5
 */
public class test {
    public static void main(String[] args) {

        List<Integer> kkk = Lists.newArrayList();


        for (int i = 0; i < 1000; i++) {
            kkk.add(0);
        }

        kkk.stream().parallel().forEach(e->{
            try {
                int ll = 1 / e;
            } catch (Exception ex) {

            }
            System.out.println(e);
        });
    }
}
