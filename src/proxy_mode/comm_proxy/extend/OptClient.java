package proxy_mode.comm_proxy.extend;

/**
 * 代理模式(委托模式)
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:50
 **/
public class OptClient {


    public static void main(String[] args) {

        IGamePlayer player = new GamePlayerProxy("张三");
        player.login("username","password");
        player.killBoss();
        player.upgrade();



    }
}
