package action.visitorMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
