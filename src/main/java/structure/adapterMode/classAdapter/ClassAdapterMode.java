package structure.adapterMode.classAdapter;

import structure.adapterMode.Source;
import structure.adapterMode.Targetable;

/**
 * Created by zengjianlu on 2018/2/23.
 * 适配器模式：使用的场景就是我们需要一个类A来实现接口B，但是类A并没有实现接口B中的所有方法，而类A是不能被改变的，
 * 这时我们可以创建一个类C，它继承类A并实现接口B，这个类C就是一个适配器。适配器中的代码将接受你所拥有的接口，
 * 并产生你所需要的接口
 *
 *
 * 类的适配器模式
 *
 *
 *
 */
public class ClassAdapterMode extends Source implements Targetable {
    public void doing() {
        System.out.println("donging");
    }

    public static void main(String[] args) {
        Targetable targetable = new ClassAdapterMode();
        targetable.eat();
        targetable.doing();
    }
}
