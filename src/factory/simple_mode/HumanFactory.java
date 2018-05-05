package factory.simple_mode;

import factory.Human;

/**
 * 简单工厂模式 又称为静态工厂模式
 * 变化:去掉抽象工厂类 将创建实例方法声明为静态
 * @author Yuekai.sun
 * @create 2018-03-30 上午10:54
 **/
public class HumanFactory {


    public static <T extends Human> T createHuman(Class<T> c) {

        //定义一个待创建的人种
        Human human = null;


        try {
            human = (Human) Class.forName(c.getName()).newInstance();
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
