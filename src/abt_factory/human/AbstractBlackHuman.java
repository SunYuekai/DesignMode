package abt_factory.human;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ионГ11:34
 **/
public abstract  class AbstractBlackHuman implements Human {


    @Override
    public void talk() {

        System.out.println("say.....black");
    }

    @Override
    public void getColor() {

        System.out.println("I'm black");

    }
}
