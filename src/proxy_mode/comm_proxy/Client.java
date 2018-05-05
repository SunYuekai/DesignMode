package proxy_mode.comm_proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 обнГ4:45
 **/
public class Client {


    public static void main(String[] args) {


        IGamePlayer player  = new GamePlayer("уехЩ");
        player.login("username","password");
        player.killBoss();
        player.upgrade();

    }
}
