package action.chainOfResponsibilityMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class MyHandler extends AbstractHandle implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public void operator() {
        System.out.println(name + " : deal!");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}