package structure.proxyMode;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Test {
    public static void main(String[] args) {
        //静态代理
//        Sourceable sourceable = new Proxy();
//        sourceable.method();
        //jdk代理
//        Sourceable sourceable = (Sourceable) new DynamicProxy().getProxyObject(new Source());
//        sourceable.method();
        //cglib代理
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Source.class);
        enhancer.setCallback(new CglibDynamicProxy());
        Sourceable sourceable = (Sourceable) enhancer.create();
        sourceable.method();
    }
}
