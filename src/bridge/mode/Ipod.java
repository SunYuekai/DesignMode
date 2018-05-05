package bridge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 下午12:08
 **/
public class Ipod extends Product{


    @Override
    public void beSelled() {

        System.out.println("Ipod被销售");
    }

    @Override
    public void beProduced() {
        System.out.println("Ipod被生产");

    }
}
