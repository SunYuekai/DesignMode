package factory.multi_mode;

import factory.BlackHuman;
import factory.Human;
import factory.WhiteHuman;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ионГ11:01
 **/
public class WhiteHumanFactory extends AbstractHumanFactory {


    @Override
    public Human createHuman() {

        return new WhiteHuman();

    }
}
