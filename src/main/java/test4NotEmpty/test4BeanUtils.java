package test4NotEmpty;

import lombok.Data;
import org.apache.commons.beanutils.BeanUtils;

import javax.validation.constraints.NotEmpty;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

/**
 * @author by woyuan  2022/8/29
 */
public class test4BeanUtils {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Approval approval = new Approval();

        approval.setAccountName("accountName");
        approval.setAuditMessage("auditMsg");
        approval.setAffectedAppkey("affectedAppkey");
        approval.setBizId("bizId");
        approval.setNeedMutex(Boolean.TRUE);

        InitiateApprovalReq req= new InitiateApprovalReq();


        BeanUtils.copyProperties(req, approval);

        approval.setNeedMutex(false);

        BeanUtils.copyProperties(approval, req);


        System.out.println("hah");

    }

    @Data
    public static class Approval {
        private Long id;

        private String accountName;

        private String eventName;

        private String eventUuid;

        private String operatorId;

        private String skey;

        private String misAppkey;

        private String affectedAppkey;

        private String bizId;

        private String lionKey;

        private String callbackAppkey;

        private Integer callbackAppkeyPort;

        private String callbackAppkeyBody;

        private Boolean callbackIdempotent;

        private String approveStatus;

        private Date eventStartTime;

        private Date eventEndTime;

        private String auditMessage;

        private String env;

        private Date createTime;

        private Date updateTime;

        private Boolean needMutex;
    }

    @Data
    public static class InitiateApprovalReq {
        private String skey;

        private String lionKey;

        private String bizId;

        private String misAppkey;

        private String affectedAppkey;

        private String auditMsg;

        private String oldReqParam;

        private String newReqParam;

        private String operatorId;

        private String auditStrategy;

        private List<String> firstLevelAuditors;

        private List<String> secondLevelAuditors;

        private boolean callBackIdempotent;

        private String callBackAppkey;

        private int callBackAppPort;

        private String callBackBody;

        private boolean needMutex;
    }
}
