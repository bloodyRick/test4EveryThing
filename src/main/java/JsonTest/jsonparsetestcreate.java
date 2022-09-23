package JsonTest;

import com.dianping.lion.common.util.JsonUtils;
import org.springframework.jdbc.support.incrementer.PostgresSequenceMaxValueIncrementer;

/**
 * @author by woyuan  2022/8/4
 */
public class jsonparsetestcreate {
    public static void main(String[] args) {
        CreateGrayReleasePhysicReq req = new CreateGrayReleasePhysicReq();
        req.setAppKey("com.sankuai.payrc.nobel");
        req.setBatchRuleName("default_set-batch-rule");//default_set-batch-rule
        req.setEnv("test");
        req.setOperatorId("houchen06");
        req.setsKey("com.sankuai.payrc.nobel__batchchange__change");
        System.out.println(JsonUtils.toJson(req));
    }
}
