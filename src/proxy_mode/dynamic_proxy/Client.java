package proxy_mode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:45
 **/
public class Client {


    public static void main(String[] args) {


        IGamePlayer player  = new GamePlayer("����");
        //����IH����ʵ��
        InvocationHandler ihProxy = new GamePlayIH(player);
        //��ȡ����ض���
        ClassLoader cl = player.getClass().getClassLoader();
        //��ȡ��̬�������
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{

                IGamePlayer.class
        },ihProxy);
        proxy.killBoss();






    }
}
