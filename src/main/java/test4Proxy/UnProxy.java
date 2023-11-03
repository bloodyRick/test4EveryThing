package test4Proxy;

/**
 * @author by woyuan  2023/4/18
 */
public class UnProxy implements SubInterface{
    @Override
    public String out(String in) {
        System.out.println(in);
        return in;
    }
}
