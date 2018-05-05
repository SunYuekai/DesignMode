package factory.multi_mode;

import factory.BlackHuman;
import factory.Human;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ионГ11:01
 **/
public class BlackHumanFactory extends AbstractHumanFactory {


    @Override
    public Human createHuman() {

        return new BlackHuman();

    }
}
