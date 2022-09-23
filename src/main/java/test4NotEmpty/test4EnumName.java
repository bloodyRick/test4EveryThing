package test4NotEmpty;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2022/8/30
 */
public class test4EnumName {

    public static void main(String[] args) {
//        String aa = AuditState.ACCEPTED.name();
//        System.out.println(aa);
//        System.out.println(aa.equals("ACCEPTED"));
        Long aa = null;
        System.out.println(aa);

        Boolean dd = null;
        System.out.println(Boolean.TRUE.equals(dd));

//        List<MapTest> mapTests = Lists.newArrayList();
//        mapTests.add(new MapTest("1", "11"));
//        mapTests.add(new MapTest("1", "12"));
//        mapTests.add(new MapTest("1", "13"));
//        mapTests.add(new MapTest("1", "14"));
//        mapTests.add(new MapTest("2", "21"));
//        mapTests.add(new MapTest("2", "22"));


    }


    public enum AuditState {
        /**
         * 审核中
         */
        AUDITING,
        /**
         * 通过
         */
        ACCEPTED,
        /**
         * 驳回
         */
        REJECTED,
        /**
         * 撤销
         */
        CANCELED;
    }

    public static class MapTest {
        String a;
        String b;

        public MapTest(String a, String b) {
            this.a = a;
            this.b = b;
        }
    }
}
