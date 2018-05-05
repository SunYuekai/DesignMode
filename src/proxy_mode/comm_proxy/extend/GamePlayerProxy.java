package proxy_mode.comm_proxy.extend;

/**�޸��˹��캯�� ͨ���������ƴ���ʵ��
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:47
 **/
public class GamePlayerProxy implements IGamePlayer {


    private IGamePlayer player = null;
//    ͨ�����췽�����뱻�������
    public GamePlayerProxy(String username){

        try {
            this.player = new GamePlayer(this,username);
        } catch (Exception e) {
            e.printStackTrace();
        }

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
}
