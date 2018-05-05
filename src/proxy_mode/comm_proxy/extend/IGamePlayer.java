package proxy_mode.comm_proxy.extend;

/**普通代理者模式扩展 将被代理对象创建实例过程屏蔽
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
