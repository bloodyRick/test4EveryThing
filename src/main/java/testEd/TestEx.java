package testEd;

/**
 * @author by woyuan  2022/7/7
 */
public class TestEx {
    public static void main(String[] args) {
        try{
            test();
        }catch (Exception e){
            System.out.println("hahah");
//            e.printStackTrace();
        }


    }

    public static void test () {
        throw new RuntimeException("userName or password must not be empty");
    }
}
