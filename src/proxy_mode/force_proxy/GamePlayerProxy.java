package proxy_mode.force_proxy;

/**修改了构造函数 通过传入名称创建实例
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:47
 **/
public class GamePlayerProxy implements IGamePlayer {


    private IGamePlayer player = null;
//    通过构造方法传入被代理对象
    public GamePlayerProxy(IGamePlayer gamePlayer){


            this.player = gamePlayer;


    }

    @Override
    public void login(String username, String password) {
        player.login(username,password);
    }

    @Override
    public void killBoss() {

        player.killBoss();
    }

    @Override
    public void upgrade() {

        player.upgrade();

    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
