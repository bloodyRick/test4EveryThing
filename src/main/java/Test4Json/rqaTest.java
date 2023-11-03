package Test4Json;

import com.google.common.collect.Lists;
import lombok.Data;
import testSubString.JsonUtils;

import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * @author by woyuan  2023/3/2
 */
public class rqaTest {
    public static void main(String[] args) throws IOException {
//        GroupPublishNotifyRequest req = new GroupPublishNotifyRequest();
//        Random random = new Random();
//        req.setPipelineId((long) (random.nextInt(1000) + 2132110));
//        req.setAppkey("com.sankuai.finqualify.evaluation");
//
//        GroupPublishNotifyRequest.Host host1 = new GroupPublishNotifyRequest.Host();
//        host1.setHostname("set-hh-qianbao-promotion-paypromoaccount03");
//        req.setHosts(Lists.newArrayList(host1));
//
//        req.setBusinessCheckId((long) (random.nextInt(1000) + 82366419));
//        req.setGroupCount(5);
//        req.setGroupName("分组1");
//        req.setReleaseName("");
//        req.setUser("woyuan");
//
//        String reqJson = JsonUtils.toJson(req);
//        System.out.println(reqJson);
//        List<String> d = Lists.newArrayList("set-gh-trpc-trpclabsc04", "set-zf-trpc-trpclabsc04");
//        String ad = JsonUtils.toJson(d);
//        System.out.println(ad);

        TestLongNull dd = new TestLongNull();
        dd.setTest(null);

        String ad = JsonUtils.toJson(dd);
        System.out.println(dd);

        TestLongNull ddddd = JsonUtils.fromJson(ad, TestLongNull.class);
        System.out.println(ddddd.getTest());
    }

    @Data
    public static class TestLongNull {
        Long test;
    }

}
