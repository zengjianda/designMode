package create.abstractFactoryMode;

import model.Fruit;
import model.Orange;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class OrangeFactory implements AbstractFruitFatory{
    public Fruit getInstance() {
        return new Orange();
    }
}
