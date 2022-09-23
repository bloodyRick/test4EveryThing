package JsonTest;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;
import com.meituan.servicecatalog.api.annotations.TypeDoc;
import lombok.Data;

import java.util.Map;

@TypeDoc(
        description = "风险防御咨询入参"
)

@ThriftStruct
@Data
public class RiskDefendReq {

    private String sKey;

    private String eventId;

    // 如果紧急变更，直接放行
    private Boolean isEmergency;

    private Map<String, Map<String, String>> context;

    private String callBackAppName;

    private int callBackPort;


    @ThriftField(value = 1, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getsKey() {
        return sKey;
    }

    @ThriftField
    public void setsKey(String sKey) {
        this.sKey = sKey;
    }

    @ThriftField(value = 2, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getEventId() {
        return eventId;
    }

    @ThriftField
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @ThriftField(value = 3, requiredness = ThriftField.Requiredness.REQUIRED)
    public Boolean getEmergency() {
        return isEmergency;
    }

    @ThriftField
    public void setEmergency(Boolean emergency) {
        isEmergency = emergency;
    }

    @ThriftField(value = 4, requiredness = ThriftField.Requiredness.REQUIRED)
    public Map<String, Map<String, String>> getContext() {
        return context;
    }

    @ThriftField
    public void setContext(Map<String, Map<String, String>> context) {
        this.context = context;
    }

    @ThriftField(value = 5, requiredness = ThriftField.Requiredness.REQUIRED)
    public String getCallBackAppName() {
        return callBackAppName;
    }

    @ThriftField
    public void setCallBackAppName(String callBackAppName) {
        this.callBackAppName = callBackAppName;
    }

    @ThriftField(value = 6, requiredness = ThriftField.Requiredness.REQUIRED)
    public int getCallBackPort() {
        return callBackPort;
    }

    @ThriftField
    public void setCallBackPort(int callBackPort) {
        this.callBackPort = callBackPort;
    }

    @Override
    public String toString() {
        return "RiskDefendReq{" +
                "sKey='" + sKey + '\'' +
                ", eventId='" + eventId + '\'' +
                ", context=" + context +
                ", callBackAppName='" + callBackAppName + '\'' +
                ", callBackPort=" + callBackPort +
                '}';
    }
}
