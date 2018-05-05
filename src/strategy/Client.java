package strategy;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ионГ10:41
 **/
public class Client {


    public static void main(String[] args) {

        Context context = new Context(new Strategy1());
        context.exec();
        context = new Context(new Strategy2());

        context.exec();




    }
}
