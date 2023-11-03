package test4implementsIterator;

/**
 * @author by woyuan  2023/3/21
 */
public class Test4It {
    public static void main(String[] args) {
        Test4Impl t = new Test4Impl();
        t.forEach(e-> System.out.println(e));
    }
}
