package command.mode;

/**�����ɫ(����)
 * @author Yuekai.sun
 * @create 2018-04-10 ����3:41
 **/
public abstract class Command {
    //ʹ�ó��������ת�õ���ԭ�� ��������Ҫ�ⲿע��(���췽��setter�����ɲ�����������                                                                                                                                                             ���ƴ������)
    protected Reciver r1 = new Reciver1();
    protected Reciver r2 = new Reciver2();
    public abstract  void execute() ;





}
