package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 下午5:11
 **/
public class YellowHuman implements  Human{


    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("我是黄色人");

    }
}
