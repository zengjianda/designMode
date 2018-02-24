package action.MementoMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象
 */
public class Storage {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento state){
        mementos.add(state);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
