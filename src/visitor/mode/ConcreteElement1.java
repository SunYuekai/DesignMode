package visitor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 обнГ5:24
 **/
public class ConcreteElement1  extends  Element {


    @Override
    void doSomething() {
        System.out.println("ele1");
    }

    @Override
    void accept(Ivisitor visitor) {

        visitor.visit(this);
    }


}
