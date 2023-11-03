package test4Proxy;

/**
 * @author by woyuan  2023/4/18
 */
public class TestProxy {
    public static void main(String[] args) {
        UnProxy up = new UnProxy();
        SubInterface p = (SubInterface)(new Proxytt(up).getProxy());
        p.out("tt");

    }

}
