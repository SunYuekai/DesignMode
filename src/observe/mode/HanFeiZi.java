package observe.mode;

import java.util.Observable;

/**观察者模式 被观察者实现个性化接口 observable 被观测接口
 *
 *
 * @author Yuekai.sun
 * @create 2018-04-12 下午3:48
 **/
public class HanFeiZi extends Observable implements IHanFeiZi{


    @Override
    public void haveBreakFast() {
        System.out.println("韩非子在吃早饭");
        super.setChanged();
        super.notifyObservers("在吃饭");
    }

    @Override
    public void sleep() {

        System.out.println("韩非子在睡觉");


        super.setChanged();
        super.notifyObservers("在睡觉");

    }
}
