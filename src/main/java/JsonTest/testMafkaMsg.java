//package JsonTest;
//
//import com.dianping.lion.common.util.JsonUtils;
//
///**
// * @author by woyuan  2022/7/22
// */
//public class testMafkaMsg {
//    public static void main(String[] args) {
//        PostCheckMafkaMsg msg = new PostCheckMafkaMsg();
//
//        RiskDefendReq req = new RiskDefendReq();
//
//        msg.setRiskDefendReq(req);
//        String jsonStr = JsonUtils.toJson(msg);
//        PostCheckMafkaMsg msgFromJson = JsonUtils.fromJson(jsonStr, PostCheckMafkaMsg.class);
//        System.out.println(msgFromJson.getRiskDefendResp());
//    }
//}
