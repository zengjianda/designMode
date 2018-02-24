package create.abstractFactoryMode;

import model.Apple;
import model.Fruit;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class AppleFactory implements AbstractFruitFatory {
    public Fruit getInstance() {
        return new Apple();
    }
}
