package structure.adapterMode.interfacesAdapter;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class Test {
    public static void main(String[] args) {
        SourceWrapper1 sourceWrapper1 = new SourceWrapper1();
        SourceWrapper2 sourceWrapper2 = new SourceWrapper2();
        sourceWrapper1.eat();
        sourceWrapper1.doing();
        sourceWrapper2.eat();
        sourceWrapper2.doing();
    }
}
