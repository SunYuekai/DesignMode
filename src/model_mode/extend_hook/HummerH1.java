package model_mode.extend_hook;


/**
 * @author Yuekai.sun
 * @create 2018-03-30 下午2:20
 **/
public class HummerH1 extends HummerModel {
    //响喇叭
    private boolean alarmFlag = true;

    //客户自定义是否响喇叭
    public void setAlarm(boolean isAlarm){

        this.alarmFlag = isAlarm;
    }

    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    @Override
    protected void start() {

        System.out.println("H1 启动");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 鸣笛");

    }

    @Override
    protected void engineBoom() {
        System.out.println("H1引擎声");

    }

    @Override
    public void stop() {

        System.out.println("H1停车");

    }
}
