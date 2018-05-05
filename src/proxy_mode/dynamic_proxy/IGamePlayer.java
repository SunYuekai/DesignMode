package proxy_mode.dynamic_proxy;

/**动态代理者模式
 * @author Yuekai.sun
 * @create 2018-03-30 下午4:13
 **/
public interface IGamePlayer {



    //登录游戏
    public void login(String username, String password);
    //杀怪
    public void killBoss();
    //升级
    public void upgrade();



}
