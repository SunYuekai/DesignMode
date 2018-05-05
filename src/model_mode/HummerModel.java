package model_mode;

/**
 * ģ��ģʽ
 * ģ������� ͨ����ģ�巽������final���� ��ֹ���������������д
 * @author Yuekai.sun
 * @create 2018-03-30 ����2:10
 **/
public abstract class HummerModel {




    public abstract void start();

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void stop();

    /**
     * ģ�巽��
     * ���๫��ҵ���߼�
     */
    public void run(){

        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }




}
