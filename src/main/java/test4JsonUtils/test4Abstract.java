package test4JsonUtils;

import com.fasterxml.jackson.core.type.TypeReference;

import java.lang.reflect.Type;
import java.util.List;

/**
 * @author by woyuan  2022/10/26
 */
public class test4Abstract {
    public static void main(String[] args) {
        new TypeReference<List<String>>() {
            @Override
            public Type getType() {
                return super.getType();
            }
        };

        new test4TypeRef<String> ("as") {

        };
    }
}
