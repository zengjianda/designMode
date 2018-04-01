package structure.proxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler{

    private Object targetObject;

    public Object getProxyObject(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(targetObject,args);
        after();;
        return result;
    }
    public void before(){
        System.out.println("before method");
    }

    public void after(){
        System.out.println("after method");
    }
}
