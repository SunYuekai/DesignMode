package proxy_mode.virual_proxy;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:47
 **/
public class GamePlayerProxy implements IGamePlayer,Iproxy {


    private IGamePlayer player = null;

    private int totalCount;

    @Override
    public void calCount() {

        totalCount = 800;

        System.out.println("�ܹ�����"+totalCount);



    }
//    ͨ�����췽�����뱻�������

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
//   �жϴ�������Ƿ���� ��������
    @Override
    public IGamePlayer request() {
        if(player == null){

            this.player = new GamePlayer("����");

        }
        return player.request();
    }
}
