package model_mode.extend_hook;


/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����2:20
 **/
public class HummerH2 extends HummerModel {


    @Override
    protected boolean isAlarm() {
        return false;
    }

    @Override
    protected void start() {

        System.out.println("H2 ����");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 ����");
        
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2������");

    }

    @Override
    protected void stop() {

        System.out.println("H2ͣ��");

    }
}
