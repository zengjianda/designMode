package action.stateMode;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 * 类的行为是基于它的状态改变的
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void online(){
        System.out.println("我上线了");
    }

    public void left(){
        System.out.println("我下线了");
    }
}
