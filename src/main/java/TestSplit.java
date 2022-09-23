/**
 * @author by woyuan  2022/9/15
 */
public class TestSplit {
    public static void main(String[] args) {
        String prefix = "changeops_rule_audit_";
        String bizId = prefix + "eventId" + "_" + "20";
        String ss = bizId.split("_")[3];
        System.out.println(ss);

    }

    public void test() {
        synchronized (this) {
            

        }
    }
}
