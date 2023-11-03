package test4JsonTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.sankuai.trisk.abnormaldetect.req.AbnormalDetectExecContext;
import lombok.Data;

import java.util.List;

/**
 * @author by woyuan  2023/2/13
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContinuousDetectMsg {
    private String skey;
//    private Boolean fixedTimeWindow;
    private String eventUuid;
    private Integer interval;
    private Integer detectIndex;
//    private List<AbnormalDetectExecContext> contexts;
    private String misId;
}
