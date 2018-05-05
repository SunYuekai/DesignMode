package model_mode.extend_hook;

/**
 * 模板模式扩展
 * 添加钩子hook函数
 * @author Yuekai.sun
 * @create 2018-03-30 下午2:10
 **/
public abstract class HummerModel {




    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    /**
     * 模板方法
     * 子类公共业务逻辑
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
     * 钩子函数
     * 默认喇叭会响 返回true
     * @return
     */
    protected boolean isAlarm(){


        return true;
    }



}
