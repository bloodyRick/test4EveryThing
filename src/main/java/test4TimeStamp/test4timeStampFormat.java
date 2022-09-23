package test4TimeStamp;

import java.text.SimpleDateFormat;

/**
 * @author by woyuan  2022/8/26
 */
public class test4timeStampFormat {
    public static void main(String[] args) {
        long timeStamp = System.currentTimeMillis();
        String aa = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(timeStamp);
        System.out.println(aa);
    }
}
