package media.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 обнГ3:12
 **/
public class ConcreteMediator extends Mediator {


    @Override
    public void doSomething1() {

        super.c1.method1();
        super.c1.method2();
    }

    @Override
    public void doSomething2() {


        super.c2.method1();
        super.c2.method2();

    }
}
