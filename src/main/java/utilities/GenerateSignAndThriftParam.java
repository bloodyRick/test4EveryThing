package utilities;

import com.meituan.service.mobile.mtthrift.util.json.JacksonUtils;
import com.sankuai.pay.mra.sdk.common.compoment.util.SignUtils;
import org.apache.commons.lang3.StringUtils;

public class GenerateSignAndThriftParam {
    public static void main(String[] args) {
//        final String a = "pay-rzone-bj-111003";
//        a= "accoumt" + "-" + StringUtils.substringAfter(a,"-");
//        String ass = StringUtils.substringAfter(a, "-");
//        System.out.println(ass);
//com.sankuai.pay.mra.sdk.routerops.protocol.request


//        getZoneInfoReq();
        getAddZoneReq();


//        System.out.println(JacksonUtils.deserialize(JacksonUtils.serialize(infoReq),infoReq.getClass()));

    }

    static void getAddZoneReq() {
        ZoneAddReq zoneAddReq = new ZoneAddReq();
        zoneAddReq.setCallerId("mra_inner");
        zoneAddReq.setIdc(1);
        zoneAddReq.setPartnerId("account");
        zoneAddReq.setSignType("MD5");
        zoneAddReq.setZoneId("111973");

        String zoneAddReqSign = SignUtils.genMD5Sign(zoneAddReq, "cL!vixVG&@!YcBvt");
        zoneAddReq.setSign(zoneAddReqSign);
        String json = JacksonUtils.serialize(zoneAddReq);
        String result = json.replace("utilities", "com.sankuai.pay.mra.sdk.routerops.protocol.request");
        System.out.println(result);

    }

    static void getZoneInfoReq() {
        ZoneInfoReq infoReq = new ZoneInfoReq();
        infoReq.setCallerId("mra_inner");
        infoReq.setPartnerId("pay");
        infoReq.setSignType("MD5");
        String signValue = SignUtils.genMD5Sign(infoReq, "cL!vixVG&@!YcBvt");//mra_router_ops_key
        infoReq.setSign(signValue);
        String json = JacksonUtils.serialize(infoReq);
        String result = json.replace("utilities", "com.sankuai.pay.mra.sdk.routerops.protocol.request");
        System.out.println(result);

    }

    static <T> T get(T t){
        return t;
    }

}
//com.sankuai.pay.mra.sdk.routerops.protocol.request