package action.interpreterMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
