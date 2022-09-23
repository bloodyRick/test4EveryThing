package test4flatmap;

import com.dianping.lion.common.util.JsonUtils;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sankuai.mcm.client.sdk.context.handler.AuditChainNode;
import com.sankuai.mcm.client.sdk.context.handler.AuditorOperation;
import com.sankuai.mcm.client.sdk.enums.AuditOperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2022/9/20
 */
public class test4AuditChainNode {
    public static void main(String[] args) {

        List<AuditChainNode> auditChainNodes = Lists.newArrayList();
        auditChainNodes.add(genRandomAuditChainNode());
        List<AuditorOperation> ddd = auditChainNodes.stream().map(AuditChainNode::getAuditorOperations)
                .flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(ddd);

        List<String> adfa = Lists.newArrayList();
        adfa.add("a");
        adfa.add("b");
        adfa.add("c");
        System.out.println(adfa.contains("a"));

        Map<String,String> testMap = Maps.newHashMap();
        testMap.put("1", "2");
        System.out.println(JsonUtils.toJson(testMap));
    }

    public static AuditChainNode genRandomAuditChainNode() {
        AuditChainNode d = new AuditChainNode();
        List<AuditorOperation> aa = Lists.newArrayList();
        AuditorOperation ap = new AuditorOperation();
        ap.setAuditor("woyuan");
        ap.setComment("sdfa");
        ap.setOperation(AuditOperation.ACCEPT);
        aa.add(ap);

        d.setAuditorOperations(aa);
        return d;

    }
}
