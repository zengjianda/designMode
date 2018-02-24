package action.commandMode;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 * 命令发送者与命令执行者解耦；可扩展命令模式：对请求排队或者记录请求日志，以及支持可撤销的操作；
 * 每一个命令都是一个操作：请求的一方发出请求，要求执行一个操作；接收的一方收到请求，并执行操作。
 *
 * 抽象命令
 *
 *
 */
public interface Command {
    public void execute();
}
