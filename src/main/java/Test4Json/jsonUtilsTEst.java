package Test4Json;

import testSubString.JsonUtils;

import java.io.IOException;

/**
 * @author by woyuan  2023/3/14
 */
public class jsonUtilsTEst {
    public static void main(String[] args) throws IOException {
        Host h1 = new Host();
        h1.setPort("8080");
        h1.setHostname("aasdf");
        h1.setIp("192.31.21.1");
        String re1 = JsonUtils.toJson(h1);
        System.out.println(re1);

        HostBrief hb1 = JsonUtils.fromJson(re1, HostBrief.class);
        System.out.println(hb1);
    }
}
