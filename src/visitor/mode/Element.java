package visitor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午5:19
 **/
public abstract class Element {

    //业务逻辑
    abstract void doSomething();
    //允许哪个访问者访问
    abstract void accept(Ivisitor visitor);

}
