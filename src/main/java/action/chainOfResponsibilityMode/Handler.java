package action.chainOfResponsibilityMode;

/**
 * Created by zengjianlu on 2018/2/24.
 *
 *有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，
 * 直到某一对象决定处理该请求。但是发出者并不清楚到底最终那个对象会处理该请求
 *
 */
public interface Handler {
    public void operator();
}
