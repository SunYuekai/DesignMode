package proxy_mode.comm_proxy.extend;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:45
 **/
public class Client {


    public static void main(String[] args) {


        IGamePlayer playerProxy  = new GamePlayerProxy("����");
        playerProxy.login("username","password");
        playerProxy.killBoss();
        playerProxy.upgrade();

    }
}
