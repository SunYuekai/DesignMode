package abt_factory.factory;

import abt_factory.human.Human;
import abt_factory.human.MaleBlackHuman;
import abt_factory.human.MaleWhiteHuman;
import abt_factory.human.MaleYellowHuman;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ионГ11:44
 **/
public class MaleFactory implements HumanFactory {



    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}

