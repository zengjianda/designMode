package action.strategyMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context(new OptionAdd());
        double result = context.executeStrategy(1,3);
        System.out.println("add:" + result);
        context = new Context(new OptionSubstract());
        result = context.executeStrategy(1,3);
        System.out.println("substract:" + result);
        context = new Context(new OptionMultiply());
        result = context.executeStrategy(1,3);
        System.out.println("multiply:" + result);
        context = new Context(new OptionDivide());
        result = context.executeStrategy(1,3);
        System.out.println("divide:" + result);
    }
}
