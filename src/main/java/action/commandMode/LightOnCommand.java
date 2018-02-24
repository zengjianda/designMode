package action.commandMode;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 * 具体命令
 */
public class LightOnCommand implements Command{
    private Receiver receiver;

    public LightOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.turnON();
    }
}
