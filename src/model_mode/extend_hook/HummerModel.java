package model_mode.extend_hook;

/**
 * ģ��ģʽ��չ
 * ��ӹ���hook����
 * @author Yuekai.sun
 * @create 2018-03-30 ����2:10
 **/
public abstract class HummerModel {




    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    /**
     * ģ�巽��
     * ���๫��ҵ���߼�
     */
    final  public void run(){

        this.start();
        this.engineBoom();
        if(isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    /**
     * ���Ӻ���
     * Ĭ�����Ȼ��� ����true
     * @return
     */
    protected boolean isAlarm(){


        return true;
    }



}
