package Test4Json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 分组开始发布请求
 * Created by zhoutong10 on 2021/4/12.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupPublishNotifyRequest {
    /**
     * 发布任务唯一标识
     */
    @JsonProperty("pipeline_id")
    private Long pipelineId;
    /**
     * 服务appkey
     */
    private String appkey;
    /**
     * 分组主机
     */
    private List<Host> hosts;
    /**
     * 操作人
     */
    private String user;
    /**
     * 分组总数
     */
    @JsonProperty("group_count")
    private Integer groupCount;
    /**
     * 分组下标
     */
    @JsonProperty("group_index")
    private Integer groupIndex;
    /**
     * 分组名称
     */
    @JsonProperty("group_name")
    private String groupName;
    /**
     * 分组名称
     */
    @JsonProperty("release_name")
    private String releaseName;
    private String srv;
    /**
     * 分组检测唯一标识
     */
    @JsonProperty("business_check_id")
    private Long businessCheckId;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Host {
        /**
         * 主机名
         */
        private String hostname;
        /**
         * ip
         */
        private String ip;
        /**
         * 机房
         */
        private String idc;
        /**
         * set
         */
        private String cell;
        /**
         * 泳道
         */
        private String swimlane;
    }
}
