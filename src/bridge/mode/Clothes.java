package bridge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 下午12:09
 **/
public class Clothes extends Product {


    @Override
    public void beSelled() {

        System.out.println("衣服被销售");
    }

    @Override
    public void beProduced() {


        System.out.println("衣服被生产");

    }
}
