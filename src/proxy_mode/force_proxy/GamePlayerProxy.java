package proxy_mode.force_proxy;

/**�޸��˹��캯�� ͨ���������ƴ���ʵ��
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:47
 **/
public class GamePlayerProxy implements IGamePlayer {


    private IGamePlayer player = null;
//    ͨ�����췽�����뱻�������
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
