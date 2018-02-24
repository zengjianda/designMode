package structure.proxyMode;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Proxy implements Sourceable{

    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    public void method() {
        before();
        source.method();
        after();
    }

    public void before(){
        System.out.println("before method");
    }

    public void after(){
        System.out.println("after method");
    }
}
