package JsonTest;



import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;
import com.meituan.servicecatalog.api.annotations.TypeDoc;
import lombok.Data;

import java.util.List;

@TypeDoc(
        description = "风险防御咨询出参"
)

/**
 * 这边没用baseResp的原因是，thrift限制
 */
@ThriftStruct
@Data
public class RiskDefendResp extends AbstractBaseResp {

    private Integer riskDefendResult;

    private List<String> riskDefendMsg;

    public RiskDefendResp(Integer riskDefendResult, List<String> riskDefendMsg) {
        this.riskDefendResult = riskDefendResult;
        this.riskDefendMsg = riskDefendMsg;
    }

    @Override
    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getStatus() {
        return status;
    }

    @Override
    @ThriftField
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    @ThriftField
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    @ThriftField
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.REQUIRED)
    public Integer getRiskDefendResult() {
        return riskDefendResult;
    }

    @ThriftField
    public void setRiskDefendResult(Integer riskDefendResult) {
        this.riskDefendResult = riskDefendResult;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.REQUIRED)
    public List<String> getRiskDefendMsg() {
        return riskDefendMsg;
    }

    @ThriftField
    public void setRiskDefendMsg(List<String> riskDefendMsg) {
        this.riskDefendMsg = riskDefendMsg;
    }

//    @Override
//    public String toString() {
//        return "RiskDefendResp{" +
//                "riskDefendMsg=" + riskDefendMsg +
//                ", status='" + status + '\'' +
//                ", errorCode='" + errorCode + '\'' +
//                ", errorMsg='" + errorMsg + '\'' +
//                '}';
//    }
}

