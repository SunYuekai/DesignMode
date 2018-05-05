package media.mode;

/**中介者模式:形成星星拓扑 协调工作 例如MVC框架
 * @author Yuekai.sun
 * @create 2018-04-10 下午3:01
 **/
public abstract  class Mediator {




    //同事类定义
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }
    //中介者业务逻辑
    public abstract void doSomething1();

    public abstract void doSomething2();
}
