package structure.decoratorMode;

/**
 * Created by zengjianlu on 2018/2/23.
 *
 * 具体组件 --无咖啡因
 */
public class Decaf implements Coffee{
    public double cost() {
        return 8;
    }
}
