package Test4convertUtils;

import org.apache.commons.beanutils.ConvertUtils;

import java.lang.reflect.Field;
import java.net.SocketTimeoutException;

/**
 * @author by woyuan  2022/6/29
 */
public class convert {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
//        Base dd = new Base(){
//
//            @Override
//            public String getStatus() {
//                return "dddd";
//            }
//
//            @Override
//            public void setStatus(String status) {
//                this.status = "status";
//            }
//        };
//        Object ddd = ConvertUtils.convert(dd,Resp.class);

        Class clazz = Resp.class;

        Field[] fields =clazz.getDeclaredFields();
        Field field = clazz.getField("status");
        Object ob = clazz.newInstance();
        field.set(ob, "hahh");

        System.out.println(ob);
    }
}
