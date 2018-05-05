package proxy_mode.virual_proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:47
 **/
public class GamePlayerProxy implements IGamePlayer,Iproxy {


    private IGamePlayer player = null;

    private int totalCount;

    @Override
    public void calCount() {

        totalCount = 800;

        System.out.println("总共消费"+totalCount);



    }
//    通过构造方法传入被代理对象

    public GamePlayerProxy(IGamePlayer player){

        this.player = player;
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
//   判断代理对象是否存在 若不存在
    @Override
    public IGamePlayer request() {
        if(player == null){

            this.player = new GamePlayer("张三");

        }
        return player.request();
    }
}
