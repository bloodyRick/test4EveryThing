package JsonTest;


import com.dianping.lion.common.util.JsonUtils;

/**
 * @author by woyuan  2022/7/7
 */
public class JsonTe {
    public static void main(String[] args) {

        Test tt = JsonUtils.fromJson("", Test.class);
        System.out.println(tt);
    }

    public static class Test {

    }
}
