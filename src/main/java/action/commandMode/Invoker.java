package action.commandMode;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 * 命令调用者：负责调用
 */
public class Invoker {
    public void execute(Command command){
        command.execute();
    }
}
