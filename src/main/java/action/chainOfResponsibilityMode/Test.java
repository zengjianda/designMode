package action.chainOfResponsibilityMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Test {
    public static void main(String[] args) {
        MyHandler login = new MyHandler("login");
        MyHandler permissions = new MyHandler("permissions");
        login.setHandler(permissions);
        login.operator();
    }
}
