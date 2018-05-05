package adapt.mode;


import java.applet.Applet;

/**
 * 适配器角色(核心)继承源角色(带转换角色)并实现目标角色公共接口
 * @author Yuekai.sun
 * @create 2018-04-12 上午11:22
 **/
public class Adapter extends Adaptee implements Target {


    @Override
    //在此方法中封装(adaptee源目标对象super的方法实现业务逻辑结合)
    public void request() {

        super.doSomething();


    }



}
