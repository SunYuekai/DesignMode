package proxy_mode.force_proxy;

/**ǿ�ƴ�����ģʽ
 * @author Yuekai.sun
 * @create 2018-03-30 ����4:13
 **/
public interface IGamePlayer {



    //��¼��Ϸ
    public void login(String username, String password);
    //ɱ��
    public void killBoss();
    //����
    public void upgrade();
    //ǿ�ƴ���ģʽ��ӻ�ȡ����������ӿ�
    public IGamePlayer getProxy();


}
