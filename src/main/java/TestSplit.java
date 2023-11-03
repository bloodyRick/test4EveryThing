import java.util.Arrays;
import java.util.List;

/**
 * @author by woyuan  2022/9/15
 */
public class TestSplit {
    public static void main(String[] args) {
//        String prefix = "changeops_rule_audit_";
//        String bizId = prefix + "eventId" + "_" + "20";
//        String ss = bizId.split("_")[3];
//        System.out.println(ss);
        String afda = "|asdf,2,sad2,11,";
        List<String> ssssss = Arrays.asList(afda.split("\\|"));

        for (String s : ssssss) {
            System.out.println(s);
        }

    }

    public void test() {
        synchronized (this) {


        }
    }
}
