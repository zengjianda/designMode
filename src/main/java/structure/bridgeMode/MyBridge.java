package structure.bridgeMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }
}
