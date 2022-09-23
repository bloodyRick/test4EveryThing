package function;

import JsonTest.RiskDefendReq;
import JsonTest.RiskDefendResp;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author by woyuan  2022/8/16
 */
public class test4toString {
    public static void main(String[] args) {
//        RiskDefendResp resp  = new RiskDefendResp();
//
//        resp.setStatus("status");
//        resp.setErrorCode("10130");
//        resp.setErrorMsg("msg");
//        resp.setRiskDefendMsg(Lists.newArrayList());
//        resp.setRiskDefendResult(1);
//        System.out.println(resp.toString());
        List<RiskDefendResp> list = Lists.newArrayList();
        List<String> ok = Lists.newArrayList();
        ok.add("ok");
        list.add(new RiskDefendResp(1, ok));
        System.out.println(list.toString());
    }
}
