package proxy_mode.comm_proxy.extend;

/**
 * 修改构造方法 添加代理对象
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:43
 **/
public class GamePlayer implements IGamePlayer {
    private String name = "" ;

    public GamePlayer(IGamePlayer proxy ,String name) throws Exception{

        if(proxy == null){
            throw new Exception("不能创建实例");
        }else{

            this.name = name;
        }

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
