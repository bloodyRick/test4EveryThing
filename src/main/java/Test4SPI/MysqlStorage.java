package Test4SPI;

/**
 * @author by woyuan  2023/3/21
 */
public class MysqlStorage implements DataStorage {
    @Override
    public String search(String key) {
        return "【Mysql】搜索" + key + "，结果：No";
    }
}
