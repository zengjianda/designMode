package structure.decoratorMode;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new Mocha(coffee);
        coffee = new Whip(coffee);
        System.out.println(coffee.cost());
    }
}
