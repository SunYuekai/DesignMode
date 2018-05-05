package proxy_mode.virual_proxy;

/**虚拟代理者模式
 * 添加了 获取代理对象请求方法request
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
    //请求代理对象
    public IGamePlayer request();



}
