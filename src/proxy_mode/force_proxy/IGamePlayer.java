package proxy_mode.force_proxy;

/**强制代理者模式
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
    //强制代理模式添加获取自身代理对象接口
    public IGamePlayer getProxy();


}
