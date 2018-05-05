package adapt.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 上午11:25
 **/
public class Client {

    public static void main(String[] args) {

        //原有的业务逻辑
        Target target = new ConcreteTarget();
        target.request();
        //增加适配器角色后的业务逻辑
        Target target2 = new Adapter();
        target2.request();

    }
}
