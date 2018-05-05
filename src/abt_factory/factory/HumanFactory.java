package abt_factory.factory;

import abt_factory.human.Human;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����11:38
 **/
public interface HumanFactory {

    //��������
    public Human createYellowHuman();
    //��������
    public Human createBlackHuman();
    //��������
    public Human createWhiteHuman();


}
