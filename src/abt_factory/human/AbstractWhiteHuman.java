package abt_factory.human;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ионГ11:34
 **/
public abstract  class AbstractWhiteHuman implements Human {


    @Override
    public void talk() {

        System.out.println("say.....white");
    }

    @Override
    public void getColor() {

        System.out.println("I'm White");

    }
}
