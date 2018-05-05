package abt_factory.factory;

import abt_factory.human.FemaleBlackHuman;
import abt_factory.human.FemaleWhiteHuman;
import abt_factory.human.FemaleYellowHuman;
import abt_factory.human.Human;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ионГ11:40
 **/
public class FemaleFactory implements HumanFactory {


    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
