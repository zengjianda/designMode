package action.mediatorMode;

import java.util.Date;

/**
 * Created by zengjianlu on 2018/2/24.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
