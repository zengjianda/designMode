package action.stateMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(){
        if("online".equals(state.getValue())){
            state.online();
        }
        if("left".equals(state.getValue())){
            state.left();
        }
    }
}
