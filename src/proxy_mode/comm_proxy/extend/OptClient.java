package proxy_mode.comm_proxy.extend;

/**
 * ����ģʽ(ί��ģʽ)
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:50
 **/
public class OptClient {


    public static void main(String[] args) {

        IGamePlayer player = new GamePlayerProxy("����");
        player.login("username","password");
        player.killBoss();
        player.upgrade();



    }
}
