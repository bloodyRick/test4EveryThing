package test4NotEmpty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author by woyuan  2022/9/19
 */
public class test4MisApprovalStatus {
    public static void main(String[] args) {
        MisApprovalStatus ssd = MisApprovalStatus.getApprovalStatus("lal");
        System.out.println(ssd);


        MisApprovalStatus ddd = MisApprovalStatus.getApprovalStatus("success");
        System.out.println(ddd);
    }


    public enum MisApprovalStatus {

        /**
         * chagneops-server回调mis，返回三种状态
         */
        SUCCESS("success","成功"),
        FAIL("fail","失败"),
        CANCELED("canceled","已取消");

        String status;
        String desc;

        MisApprovalStatus(String status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        private static Map<String, MisApprovalStatus> codeCache = null;

        public String getStatus() {
            return status;
        }
        public String getDesc() {
            return desc;
        }

        public static MisApprovalStatus getApprovalStatus(String status) {
            if (codeCache == null) {
                initCodeCache();
            }
            return codeCache.get(status);
        }

        private static void initCodeCache() {
            if (!Objects.isNull(codeCache)) {
                return;
            }
            Map<String, MisApprovalStatus> tempCache = new HashMap<>();
            MisApprovalStatus[] values = MisApprovalStatus.values();
            for (MisApprovalStatus value : values) {
                tempCache.put(value.getStatus(), value);
            }
            codeCache = tempCache;
        }
    }

}
