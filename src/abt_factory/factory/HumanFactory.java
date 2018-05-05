package abt_factory.factory;

import abt_factory.human.Human;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 上午11:38
 **/
public interface HumanFactory {

    //创建黄人
    public Human createYellowHuman();
    //创建黑人
    public Human createBlackHuman();
    //创建白人
    public Human createWhiteHuman();


}
