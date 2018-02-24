package structure.decoratorMode;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Mocha extends Decorator{
    public Mocha(Coffee coffee) {
        super(coffee);
    }
    public double cost(){
        return super.cost() + 3;
    }
}
