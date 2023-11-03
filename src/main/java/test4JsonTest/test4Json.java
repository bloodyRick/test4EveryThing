package test4JsonTest;

import java.util.Objects;

/**
 * @author by woyuan  2023/3/21
 */
public class test4Json {
    public static void main(String[] args) {
        ContinuousDetectMsg msg = new ContinuousDetectMsg();
        msg.setDetectIndex(1);
        msg.setEventUuid("adsfasd");
        msg.setInterval(3);
        msg.setSkey("asf23");
        String strOrigin = JsonUtils.toJson(msg);

        ContinousDetectMsg1 dd = JsonUtils.jsonToObject(strOrigin, ContinousDetectMsg1.class);
        System.out.println(dd);
        System.out.println(Boolean.FALSE.equals(dd.getFixedTimeWindow()));
        System.out.println(Objects.isNull(dd.getFixedTimeWindow()));
        System.out.println(Objects.isNull(""));
    }
}
