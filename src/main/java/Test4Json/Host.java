package Test4Json;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by woyuan  2023/1/17
 */
@Data
@NoArgsConstructor
public class Host {
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

    private String port;

    private String version;

    private Integer status;

}
