package state.mode;

/**״̬ģʽ
 * ʹ��״̬�ĸı�ʹ�������Ϊ�����仯
 * ����״̬��:����һ���������� ����״̬Ϊ��ʵ������
 * ����������:��������״̬ ��ǰ״̬ �Լ���Ϊ�ı仯 ��Ϊ�ı仯ͨ��״̬���иı�
 * �������������õ�ǰ���� Ҫ����ǰ����Ļ�����������Ϊthis ֮��״̬�����û��context�����������
 * @author Yuekai.sun
 * @create 2018-04-13 ����11:21
 **/
public abstract class LiftState {


    protected Context context ;


    //����ı�״̬��4����Ϊ
    abstract void open();
    abstract void stop();
    abstract void run();
    abstract void close();
}
