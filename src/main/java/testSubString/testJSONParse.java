package testSubString;

import com.dianping.lion.client.util.JsonUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author by woyuan  2022/10/24
 */
public class testJSONParse {
    public static void main(String[] args) throws IOException {

        String appkeyStr = "[\"com.sankuai\"]";
        List<String> dd =  JsonUtils.fromJson(appkeyStr, new TypeReference<List<String>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        });
        dd.forEach(System.out::println);
    }
}
