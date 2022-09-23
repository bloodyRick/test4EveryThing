package JsonTest;

import com.facebook.swift.codec.ThriftField;
import lombok.Data;

import javax.validation.constraints.Pattern;

/**
 * @author by woyuan  2022/8/4
 */
@Data
public class CreateGrayReleasePhysicReq {
    private String sKey;
    private String appKey;
    @Pattern(regexp = "(prod|test|dev|staging)",message = "必须是prod/test/dev/staging")
    private String env;
    private String batchRuleName;
    private String operatorId;


    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getsKey() {
        return sKey;
    }

    @ThriftField
    public void setsKey(String sKey) {
        this.sKey = sKey;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getAppKey() {
        return appKey;
    }

    @ThriftField
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getEnv() {
        return env;
    }

    @ThriftField
    public void setEnv(String env) {
        this.env = env;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getBatchRuleName() {
        return batchRuleName;
    }

    @ThriftField
    public void setBatchRuleName(String batchRuleName) {
        this.batchRuleName = batchRuleName;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getOperatorId() {
        return operatorId;
    }

    @ThriftField
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
}
