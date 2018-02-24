package action.visitorMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Monitor implements ComputerPart{
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
