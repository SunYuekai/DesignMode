package bridge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 下午12:08
 **/
public class House extends Product {


    @Override
    public void beSelled() {


        System.out.println("房子被销售");
    }

    @Override
    public void beProduced() {
        System.out.println("房子被生产");
    }
}
