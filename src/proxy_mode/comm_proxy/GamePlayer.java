package proxy_mode.comm_proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:43
 **/
public class GamePlayer implements IGamePlayer {
    private String name = "" ;

    public GamePlayer(String name){

        this.name = name;
    }

    @Override
    public void login(String username, String password) {

        System.out.println("登录了"+username+password);
    }

    @Override
    public void killBoss() {

        System.out.println(name+"打BOSS");

    }

    @Override
    public void upgrade() {

        System.out.println(name+"升级了");

    }

}
