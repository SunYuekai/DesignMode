package model_mode.extend_hook;


/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����2:20
 **/
public class HummerH1 extends HummerModel {
    //������
    private boolean alarmFlag = true;

    //�ͻ��Զ����Ƿ�������
    public void setAlarm(boolean isAlarm){

        this.alarmFlag = isAlarm;
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    @Override
    protected void start() {

        System.out.println("H1 ����");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 ����");

    }

    @Override
    protected void engineBoom() {
        System.out.println("H1������");

    }

    @Override
    public void stop() {

        System.out.println("H1ͣ��");

    }
}
