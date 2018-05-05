package model_mode.extend_hook;


/**
 * @author Yuekai.sun
 * @create 2018-03-30 下午2:20
 **/
public class HummerH2 extends HummerModel {


    @Override
    protected boolean isAlarm() {
        return false;
    }

    @Override
    protected void start() {

        System.out.println("H2 启动");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 鸣笛");
        
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2引擎声");

    }

    @Override
    protected void stop() {

        System.out.println("H2停车");

    }
}
