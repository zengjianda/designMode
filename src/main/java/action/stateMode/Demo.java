package action.stateMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Demo {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);
        state.setValue("online");
        context.changeState();

        state.setValue("left");
        context.changeState();

    }
}
