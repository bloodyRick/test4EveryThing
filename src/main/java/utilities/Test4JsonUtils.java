package utilities;

import com.sankuai.pay.mra.sdk.common.compoment.util.JsonUtils;

/**
 * @Created by woyuan  2021/11/23
 */
public class Test4JsonUtils {

    public static void main(String[] args) {
        ZoneSwitch zs = new ZoneSwitch("1232", "113");
        String a = JsonUtils.toJSONString(zs);
        System.out.println(a);
    }

    private static final class ZoneSwitch{ //这里是导入一个lombok还是手写一段set代码比较好？
        public String fromZone;
        public String toZone;

        public void setFromZone(String fromZone) {
            this.fromZone = fromZone;
        }

        public void setToZone(String toZone) {
            this.toZone = toZone;
        }

        public ZoneSwitch(String fromZone, String toZone) {
            this.fromZone = fromZone;
            this.toZone = toZone;
        }
    }
}
