package action.strategyMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public double executeStrategy(int num1, int num2){
        return calculator.calculate(num1, num2);
    }
}
