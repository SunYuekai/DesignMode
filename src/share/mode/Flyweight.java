package share.mode;

/**享元模式
 * 内部状态:不随环境改变的状态 可共享的状态
 * 外部状态:可随环境改变的状态 不可共享的状态 通常使用 JAVA自带类型(无需重写equals和hashcode方法)性能较好
 * @author Yuekai.sun
 * @create 2018-04-16 上午11:36
 **/
public abstract class Flyweight {



    //内部状态
    private String intrinsic;
    //外部状态 final修饰必须初始化值
    protected final String Entrinsic;

    public Flyweight(String entrinsic) {
        Entrinsic = entrinsic;
    }

    //定义业务操作
    abstract void operate();
    //内部状态的getter/setter


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
