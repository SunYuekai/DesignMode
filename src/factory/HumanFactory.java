package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 下午5:19
 **/
public class HumanFactory extends AbstractHumanFactory {


    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个人种
        Human human = null;
        //使用反射产生一个人种
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;



    }
}
