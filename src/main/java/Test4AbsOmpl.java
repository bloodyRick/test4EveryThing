import java.util.concurrent.locks.ReentrantLock;

public class Test4AbsOmpl {
    public static void main(String[] args) {
        ReentrantLock lock;
        System.out.println(new Test4Abstract() {
            @Override
            String test() {
                return "t";
            }
        }.test());


    }
}
