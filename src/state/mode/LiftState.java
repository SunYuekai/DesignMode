package state.mode;

/**状态模式
 * 使用状态的改变使对象的行为发生变化
 * 抽象状态类:包含一个环境对象 各种状态为其实现子类
 * 环境对象类:包含常量状态 当前状态 以及行为的变化 行为的变化通过状态进行改变
 * 环境对象中设置当前对象 要将当前对象的环境对象设置为this 之后状态的设置会对context对象产生关联
 * @author Yuekai.sun
 * @create 2018-04-13 上午11:21
 **/
public abstract class LiftState {


    protected Context context ;


    //定义改变状态的4种行为
    abstract void open();
    abstract void stop();
    abstract void run();
    abstract void close();
}
