package create.staticFactoryMode;

import model.Apple;
import model.Fruit;
import model.Orange;

/**
 * Created by zengjianlu on 2018/2/23.
 *
 * 缺点违反开闭原则，增加新的水果需要修改静态工厂方法
 *
 *
 */
public class FruitFactory {
    public static Fruit produceApple(){
        return new Apple();
    }

    public static Fruit produceOrange(){
        return new Orange();
    }
}
