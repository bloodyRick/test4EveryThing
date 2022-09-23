package function;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2022/7/7
 */
public class test4containsAll {
    public static void main(String[] args) {

        List<String> ruleExecFlows = Lists.newArrayList();

        ruleExecFlows.add("pass");
        ruleExecFlows.add("pass");
        ruleExecFlows.add("pafd");

        System.out.println(Lists.newArrayList("pass").containsAll(ruleExecFlows));
    }
}
