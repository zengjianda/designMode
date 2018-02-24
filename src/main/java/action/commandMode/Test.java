package action.commandMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();

        Command turnOnLight = new LightOnCommand(receiver);
        Command turnOffLight = new LightOffCommand(receiver);

        invoker.execute(turnOnLight);
        invoker.execute(turnOffLight);
    }
}
