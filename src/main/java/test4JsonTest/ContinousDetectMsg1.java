package test4JsonTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author by woyuan  2023/3/21
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContinousDetectMsg1 {
    private String skey;
    private Boolean fixedTimeWindow;
    private String eventUuid;
    private Integer interval;
    private Integer detectIndex;
    //    private List<AbnormalDetectExecContext> contexts;
    private String misId;
}
