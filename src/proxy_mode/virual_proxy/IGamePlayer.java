package proxy_mode.virual_proxy;

/**���������ģʽ
 * ����� ��ȡ����������󷽷�request
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
    //����������
    public IGamePlayer request();



}
