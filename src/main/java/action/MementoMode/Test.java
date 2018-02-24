package action.MementoMode;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Storage storage = new Storage();
        originator.setState("State #1");
        originator.setState("State #2");
        storage.add(originator.saveStateToMemento());
        originator.setState("State #3");
        storage.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(storage.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(storage.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
