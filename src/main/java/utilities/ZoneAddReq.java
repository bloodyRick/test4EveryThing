package utilities;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;
import com.meituan.servicecatalog.api.annotations.FieldDoc;
import com.meituan.servicecatalog.api.annotations.TypeDoc;
import com.sankuai.pay.mra.sdk.common.protocol.AbstractSignReq;

@ThriftStruct
@TypeDoc(
        description = "新增set请求",
        authors = {"zhangyang116"}
)
public class ZoneAddReq extends AbstractSignReq {
    @FieldDoc(
            description = "zoneId",
            example = {"111001"}
    )
    private String zoneId;
    @FieldDoc(
            description = "idc",
            example = {"1"}
    )
    private Integer idc;
    @FieldDoc(
            description = "partnerId",
            example = {"account", "pay"}
    )
    private String partnerId;

    public ZoneAddReq() {
    }

    @ThriftField(1)
    public String getCallerId() {
        return this.callerId;
    }

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

    @ThriftField(4)
    public String getZoneId() {
        return this.zoneId;
    }

    @ThriftField
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    @ThriftField(5)
    public Integer getIdc() {
        return this.idc;
    }

    @ThriftField
    public void setIdc(Integer idc) {
        this.idc = idc;
    }

    @ThriftField(6)
    public String getPartnerId() {
        return this.partnerId;
    }

    @ThriftField
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
}
