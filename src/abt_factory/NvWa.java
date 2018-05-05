package abt_factory;

import abt_factory.factory.FemaleFactory;
import abt_factory.factory.HumanFactory;
import abt_factory.factory.MaleFactory;

/**
 * 场景类
 * @author Yuekai.sun
 * @create 2018-03-30 上午11:46
 **/
public class NvWa {


    public static void main(String[] args) {

        //第一条生产线 生产男性

        HumanFactory maleHumanFactory = new MaleFactory();
        //生产黄人
        maleHumanFactory.createYellowHuman().getColor();
        //生产白人
        maleHumanFactory.createWhiteHuman().getColor();
        //生产黑人
        maleHumanFactory.createBlackHuman().getColor();
        //第二条生产线 生产女性
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //生产黄人
        femaleHumanFactory.createYellowHuman();
        //生产白人
        femaleHumanFactory.createWhiteHuman();
        //生产黑人
        femaleHumanFactory.createBlackHuman();


    }
}
