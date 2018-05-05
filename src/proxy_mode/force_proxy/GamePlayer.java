package proxy_mode.force_proxy;

/**
 * �޸Ĺ��췽�� ��Ӵ������
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:43
 **/
public class GamePlayer implements IGamePlayer {
    private String name = "" ;
    private IGamePlayer proxy = null;
    @Override
    public IGamePlayer getProxy() {

        this.proxy = new GamePlayerProxy(this);

        return proxy;



    }

    public GamePlayer( String name) {


            this.name = name;



    }

    @Override
    public void login(String username, String password) {
        if(isProxy()) {

            System.out.println("��¼��" + username + password);
        }else {
            System.out.println("��ʹ�ô���");
        }

    }

    @Override
    public void killBoss() {
        if(isProxy()) {

        System.out.println(name+"��BOSS");
        }else {
            System.out.println("��ʹ�ô���");
        }

    }

    @Override
    public void upgrade() {
        if(isProxy()) {

        System.out.println(name+"������");

    }else {
            System.out.println("��ʹ�ô���");
        }
    }
    private boolean isProxy(){

        if(proxy == null){

            return false;
        }else{

            return true;
        }
    }
}
