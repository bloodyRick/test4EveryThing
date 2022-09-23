package test4Time;

import java.util.Date;

/**
 * @author by woyuan  2022/8/23
 */
public class test4timeStamp {
    public static void main(String[] args) {

        long nowTimestampInSecs = (new Date()).getTime() / 1000;
        System.out.println(nowTimestampInSecs);

    }
}
