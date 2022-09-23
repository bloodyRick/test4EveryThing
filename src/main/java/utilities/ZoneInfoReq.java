package utilities;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.meituan.servicecatalog.api.annotations.FieldDoc;
import com.meituan.servicecatalog.api.annotations.TypeDoc;

@ThriftStruct
@TypeDoc(
        description = "获取SET信息入参",
        authors = {"liyang109"}
)
public class ZoneInfoReq extends AbstractSignReq {
    @FieldDoc(
            description = "partnerId",
            example = {"pay"}
    )
    private String partnerId;

    public ZoneInfoReq() {
    }

    @Override
    @ThriftField(1)
    public String getCallerId() {
        return this.callerId;
    }

    @Override
    @ThriftField
    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    @ThriftField(2)
    public String getSignType() {
        return this.signType;
    }

    @ThriftField
    public void setSignType(String signType) {
        this.signType = signType;
    }

    @ThriftField(3)
    public String getSign() {
        return this.sign;
    }

    @ThriftField
    public void setSign(String sign) {
        this.sign = sign;
    }

    @ThriftField(
            value = 4,
            requiredness = Requiredness.OPTIONAL
    )
    public String getPartnerId() {
        return this.partnerId;
    }

    @ThriftField
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
}
