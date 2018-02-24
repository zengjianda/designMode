package structure.decoratorMode;

/**
 * Created by zengjianlu on 2018/2/23.
 *
 *装饰类
 *
 */
public class Decorator implements Coffee{
    private Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost();
    }
}
