package model_mode;

/**
 * 模板模式
 * 模板抽象类 通常将模板方法加上final修饰 防止方法被子类恶意重写
 * @author Yuekai.sun
 * @create 2018-03-30 下午2:10
 **/
public abstract class HummerModel {




    public abstract void start();

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void stop();

    /**
     * 模板方法
     * 子类公共业务逻辑
     */
    public void run(){

        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }




}
