package test4Enum;

/**
 * @author by woyuan  2023/1/18
 */
public enum TimeSeriesDataProcessEnum {

    MAX("max", "获取时间序列中的最大值"),
    MIN("min", "获取时间序列中的最小值"),
    AVERAGE("average", "获取时间序列中的平均值"),
    SUM("sum", "将时间序列中的点值求和");


    private String processName;
    private String desc;

    TimeSeriesDataProcessEnum(String processName, String desc) {
        this.processName = processName;
        this.desc = desc;
    }

    public static boolean isValidEnum(String processName) {
        TimeSeriesDataProcessEnum[] values = TimeSeriesDataProcessEnum.values();
        for (TimeSeriesDataProcessEnum value : values) {
            if (value.getProcessName().equalsIgnoreCase(processName)) {
                return true;
            }
        }
        return false;
    }

    public static TimeSeriesDataProcessEnum getEnum(String processName) {
        TimeSeriesDataProcessEnum[] values = TimeSeriesDataProcessEnum.values();
        for (TimeSeriesDataProcessEnum value : values) {
            if (value.getProcessName().equalsIgnoreCase(processName)) {
                return value;
            }
        }
        return null;
    }

    public String getProcessName() {
        return processName;
    }

    public String getDesc() {
        return desc;
    }
}
