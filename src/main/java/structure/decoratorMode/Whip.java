package structure.decoratorMode;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Whip extends Decorator{
    public Whip(Coffee coffee) {
        super(coffee);
    }

    public double cost(){
        return super.cost() + 7;
    }
}
