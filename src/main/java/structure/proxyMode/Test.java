package structure.proxyMode;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Test {
    public static void main(String[] args) {
//        Sourceable sourceable = new Proxy();
//        sourceable.method();
        Sourceable sourceable = (Sourceable) new DynamicProxy().getProxyObject(new Source());
        sourceable.method();
    }
}
