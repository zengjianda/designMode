package create.singletonMode;
/**
 * Created by zengjianlu on 2018/2/23.
 * 关键是构造方法私有
 *
 * 懒汉模式 （以时间换空间）
 *
 */
public class Singleton {
    private Singleton(){}

    private static Singleton instance = null;

    /* 静态工程方法，创建实例  缺点非线程安全*/
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 同步降低了效率
     * @return
     */
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    /**
     * 改进把同步放在里面
     * @return
     */
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (instance) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }


}
