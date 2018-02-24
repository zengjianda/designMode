package action.commandMode;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 * 具体命令
 */
public class LightOffCommand implements Command{
    private Receiver receiver;

    public LightOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.turnOFF();
    }
}
