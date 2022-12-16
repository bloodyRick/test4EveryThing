package test4ClassType;

/**
 * @author by woyuan  2022/12/14
 */
public class test4ClassType {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("test4ClassType.TESTT");
        TESTT tt = (TESTT)clazz.newInstance();

        System.out.println(clazz instanceof Class);
        System.out.println(tt instanceof TESTT);

    }

}
