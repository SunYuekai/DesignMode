package abt_factory;

import abt_factory.factory.FemaleFactory;
import abt_factory.factory.HumanFactory;
import abt_factory.factory.MaleFactory;

/**
 * ������
 * @author Yuekai.sun
 * @create 2018-03-30 ����11:46
 **/
public class NvWa {


    public static void main(String[] args) {

        //��һ�������� ��������

        HumanFactory maleHumanFactory = new MaleFactory();
        //��������
        maleHumanFactory.createYellowHuman().getColor();
        //��������
        maleHumanFactory.createWhiteHuman().getColor();
        //��������
        maleHumanFactory.createBlackHuman().getColor();
        //�ڶ��������� ����Ů��
        HumanFactory femaleHumanFactory = new FemaleFactory();
        //��������
        femaleHumanFactory.createYellowHuman();
        //��������
        femaleHumanFactory.createWhiteHuman();
        //��������
        femaleHumanFactory.createBlackHuman();


    }
}
