package adapt.mode;

import adapt.mode.Target;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 上午11:18
 **/
public class ConcreteTarget implements Target {

    @Override
    public void request() {

        System.out.println("实现类的请求方法");


    }
}
