package action.chainOfResponsibilityMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public abstract class AbstractHandle {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
