package testToString;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by woyuan  2022/10/27
 */
public class test4ToString {
    public static void main(String[] args) {

        testToString a = new testToString();
        a.a= 1;
        a.b = "adsfa";
        System.out.println(a);


        Lock sssa = new ReentrantLock();

        testInterface[] dd = new testInterface[20];

        System.out.println(new Date());
//        testToStringList list = new testToStringList();
//        testToString[] dddd = list.getList();
//        dddd[0] = a;
//
//
//        System.out.println(list);

    }
}
