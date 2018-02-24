package action.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class TeacherSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private String info;

    public void addObserver(Observer obj) {
        observers.add(obj);
    }

    public void deleteObserver(Observer obj) {
        int i = observers.indexOf(obj);
        if (i >= 0) {
            observers.remove(obj);
        }
    }

    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = observers.get(i);
            o.update(info);
        }
    }

    //布置作业的方法,在方法最后,需要调用notifyObserver()方法,通知所有观察者更新状态
    public void setHomework(String info) {
        this.info = info;
        System.out.println("今天的作业是" + info);
        this.notifyObserver();
    }

}
