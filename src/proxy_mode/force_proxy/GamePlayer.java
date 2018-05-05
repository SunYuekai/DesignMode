package proxy_mode.force_proxy;

/**
 * 修改构造方法 添加代理对象
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:43
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

            System.out.println("登录了" + username + password);
        }else {
            System.out.println("请使用代理");
        }

    }

    @Override
    public void killBoss() {
        if(isProxy()) {

        System.out.println(name+"打BOSS");
        }else {
            System.out.println("请使用代理");
        }

    }

    @Override
    public void upgrade() {
        if(isProxy()) {

        System.out.println(name+"升级了");

    }else {
            System.out.println("请使用代理");
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
