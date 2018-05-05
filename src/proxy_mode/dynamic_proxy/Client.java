package proxy_mode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:45
 **/
public class Client {


    public static void main(String[] args) {


        IGamePlayer player  = new GamePlayer("张三");
        //创建IH代理实例
        InvocationHandler ihProxy = new GamePlayIH(player);
        //获取类加载对象
        ClassLoader cl = player.getClass().getClassLoader();
        //获取动态代理对象
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{

                IGamePlayer.class
        },ihProxy);
        proxy.killBoss();






    }
}
