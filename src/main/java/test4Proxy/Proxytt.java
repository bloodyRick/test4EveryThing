package test4Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author by woyuan  2023/4/18
 */
public class Proxytt implements InvocationHandler {
    Object subject;

    public Proxytt(Object subject) {
        this.subject = subject;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object res = method.invoke(subject, args);
        System.out.println("after");
        return res;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                subject.getClass().getClassLoader()
                , subject.getClass().getInterfaces(), this);
    }
}
