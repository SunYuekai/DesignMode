package factory.multi_mode;

import factory.Human;

/**
 * 多工厂模式 抽象方法不需传入参数 因为每个子类工厂创建产品对象的功能明确
 * @author Yuekai.sun
 * @create 2018-03-30 上午10:59
 **/
public abstract class AbstractHumanFactory {

    public abstract Human createHuman();
}
