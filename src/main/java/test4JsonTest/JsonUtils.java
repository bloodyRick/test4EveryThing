package test4JsonTest;

import com.dianping.lion.client.util.LogUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.meituan.firefly.boot.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author by woyuan  2023/3/21
 */
@Slf4j
public final class JsonUtils {
    // 定义objectMapper
    private static ObjectMapper objectMapper = new ObjectMapper();

    private static ObjectMapper objectMapperWithNullValueSerializer = new ObjectMapper();

    static {
        // 忽略对象中不存在的字段
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapperWithNullValueSerializer.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SerializerProvider serializerProvider = objectMapperWithNullValueSerializer.getSerializerProvider();
        serializerProvider.setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                String fieldName = jsonGenerator.getOutputContext().getCurrentName();
                try {
                    //反射获取字段类型
                    Field field = jsonGenerator.getCurrentValue().getClass().getDeclaredField(fieldName);
                    if (Objects.equals(field.getType(), String.class)) {
                        //字符串型空值""
                        jsonGenerator.writeString("");
                        return;
                    } else if (Objects.equals(field.getType(), List.class) || Objects.equals(field.getType(), Set.class)) {
                        //列表型空值返回[]
                        jsonGenerator.writeStartArray();
                        jsonGenerator.writeEndArray();
                        return;
                    }
                } catch (NoSuchFieldException e) {
                    // 当找不到对应的字段时不作处理
                }
                jsonGenerator.writeNull();
            }
        });
    }

    /**
     * 将对象转换成json字符串
     * @param obj 目标对象
     * @return
     */
    public static String toJson(Object obj) {
        if (obj == null) {
            return StringUtils.EMPTY;
        }

        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
//            log.error("Json序列化失败:{}", LogUtils.getStackTrace(e));
//            throw new BizException(ErrorCode.JSON_ERROR);
            return null;
        }
    }

    /**
     * 将json数据转换成pojo对象
     * @param json 字符串
     * @param beanType 目标类
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String json, Class<T> beanType) {
        try {
            return objectMapper.readValue(json, beanType);
        } catch (IOException e) {
//            log.error("反序列化失败:{}", LogUtils.getStackTrace(e));
//            throw new BizException(ErrorCode.JSON_ERROR);
            return null;

        }
    }

    /**
     * 将json数据转换成pojo对象list
     * @param json
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToList(String json, Class<T> beanType) {
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            return objectMapper.readValue(json, javaType);
        } catch (IOException e) {
//            log.error("反序列化到pojo对象list失败:{}", LogUtils.getStackTrace(e));
//            throw new BizException(ErrorCode.JSON_ERROR);
            return null;

        }
    }

}

