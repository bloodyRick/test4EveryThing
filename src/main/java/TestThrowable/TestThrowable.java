package TestThrowable;

import lombok.extern.slf4j.Slf4j;

/**
 * @author by woyuan  2022/9/3
 */
@Slf4j
public class TestThrowable {
    public static void main(String[] args) {
        int a = 0;
        try {
            int lk = 100 / a;

        } catch (Exception e) {
            e.printStackTrace();
            log.error("test", e);
        }
    }
}
