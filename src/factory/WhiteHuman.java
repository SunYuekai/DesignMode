package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 下午5:11
 **/
public class WhiteHuman implements  Human{


    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("我是白色人");

    }
}
