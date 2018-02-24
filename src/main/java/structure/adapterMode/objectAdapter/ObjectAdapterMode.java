package structure.adapterMode.objectAdapter;


import structure.adapterMode.Source;
import structure.adapterMode.Targetable;

/**
 * Created by zengjianlu on 2018/2/23.
 *
 * 采用对象聚合的方式进行适配
 *
 * 对象的适配器模式
 *
 */
public class ObjectAdapterMode implements Targetable {

    private Source source;

    public ObjectAdapterMode(Source source) {
        this.source = source;
    }

    public void eat() {
        source.eat();
    }

    public void doing() {
        System.out.println("object adapter doing");
    }

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new ObjectAdapterMode(source);
        targetable.eat();
        targetable.doing();
    }

}
