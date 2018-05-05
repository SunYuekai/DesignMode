package proxy_mode.comm_proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:43
 **/
public class GamePlayer implements IGamePlayer {
    private String name = "" ;

    public GamePlayer(String name){

        this.name = name;
    }

    @Override
    public void login(String username, String password) {

        System.out.println("��¼��"+username+password);
    }

    @Override
    public void killBoss() {

        System.out.println(name+"��BOSS");

    }

    @Override
    public void upgrade() {

        System.out.println(name+"������");

    }

}
