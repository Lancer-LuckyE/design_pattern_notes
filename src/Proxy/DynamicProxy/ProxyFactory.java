package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target; //!!!

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), // Uses the reflect.Proxy to create a new dynamic proxy instance.
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        System.out.println("Proxy starts..."); // proxy start
                        Object returnVal = method.invoke(target, objects); // invoke the target method and assign the method return value to a variable.
                        System.out.println("Proxy ends...");
                        return returnVal;
                    }
                });
    }
}
