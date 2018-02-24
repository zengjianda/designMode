package action.strategyMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class OptionAdd implements Calculator{

    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
