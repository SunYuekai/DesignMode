package proxy_mode.force_proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:45
 **/
public class Client {


    public static void main(String[] args) {


        IGamePlayer player = new GamePlayer("����");
        IGamePlayer proxy = player.getProxy();
        proxy.login("a","b");

    }
}
