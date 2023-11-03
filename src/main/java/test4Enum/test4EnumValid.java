package test4Enum;

/**
 * @author by woyuan  2023/1/18
 */
public class test4EnumValid {
    public static void main(String[] args) {
        System.out.println(TimeSeriesDataProcessEnum.isValidEnum("MAX"));
        System.out.println(TimeSeriesDataProcessEnum.isValidEnum("MAX"));
        System.out.println(TimeSeriesDataProcessEnum.isValidEnum("sum"));
        System.out.println(TimeSeriesDataProcessEnum.isValidEnum("SUM"));
    }
}
