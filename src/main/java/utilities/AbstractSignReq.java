package utilities;

import com.meituan.servicecatalog.api.annotations.FieldDoc;
import com.meituan.servicecatalog.api.annotations.TypeDoc;

@TypeDoc(
        description = "基础路由规则同步接口-基础请求参数集",
        authors = {"yangtongjie"}
)
public abstract class AbstractSignReq extends Req {
    @FieldDoc(
            description = "调用方标识，由基础路由同学维护，接入请联系服务负责人",
            example = {"com.sankuai.paymra.router"}
    )
    public String callerId;
    @FieldDoc(
            description = "签名类型，目前只提供MD5签名方式",
            example = {"signType=MD5"}
    )
    public String signType;
    @FieldDoc(
            description = "签名值",
            example = {"sign_value"}
    )
    public String sign;

    public AbstractSignReq() {
    }

    public abstract String getCallerId();

    public abstract void setCallerId(String var1);

    public abstract String getSignType();

    public abstract void setSignType(String var1);

    public abstract String getSign();

    public abstract void setSign(String var1);
}
