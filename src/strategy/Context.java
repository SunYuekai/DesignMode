package strategy;

/**封装策略子类 实现策略互换
 * @author Yuekai.sun
 * @create 2018-04-12 上午10:40
 **/
public class Context {


    private Istrategy stategy;

    public Context(Istrategy stategy) {
        this.stategy = stategy;
    }

    public void exec(){
        this.stategy.doSomething();



    }





}
