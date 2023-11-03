package Test4Json;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author by woyuan  2023/3/14
 */
@Data
@NoArgsConstructor
public class HostBrief {
    /**
     * 主机名
     */
    private String hostname;
    /**
     * ip
     */
    private String ip;

}
