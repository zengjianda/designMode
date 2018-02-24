package create.singletonMode;
/**
 * Created by zengjianlu on 2018/2/23.
 * 关键是构造方法私有
 *
 * 饿汉模式 （以时间换空间）
 *
 */
public class SingletonHungry {
    private SingletonHungry(){}

    private static SingletonHungry instance = new SingletonHungry();

    /* 静态工程方法，创建实例*/
    public static SingletonHungry getInstance() {
        return instance;
    }
}
