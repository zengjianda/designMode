package structure.decoratorMode;

/**
 * Created by zengjianlu on 2018/2/23.
 *
 * 具体组件--浓咖啡
 */
public class Espresso implements Coffee{
    public double cost() {
        return 10.0;
    }
}
