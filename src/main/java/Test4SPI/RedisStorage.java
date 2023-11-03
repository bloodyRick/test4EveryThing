package Test4SPI;

/**
 * @author by woyuan  2023/3/21
 */
public class RedisStorage implements DataStorage {
    @Override
    public String search(String key) {
        return "【Redis】搜索" + key + "，结果：Yes";
    }
}
