package proxy_mode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yuekai.sun
 * @create 2018-04-09 下午4:30
 **/
public class GamePlayIH implements InvocationHandler
{
//    被代理对象class类实例
     Class cls = null;
//    被代理实例
     Object player = null;

    public GamePlayIH(Object player) {
        this.player = player;
    }
//循环调用invoke
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//传入参数 被代理实例对象 被代理对象调用方法所需的参数
        Object result = method.invoke(this.player,args);

        return result;

    }
}
