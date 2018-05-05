package factory.factory_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 上午11:06
 **/
public class SingletonFactory {

    private static Singleton singleton ;

    static {


        try {
            Class cl = Class.forName(SingletonFactory.class.getName());

            //获得无参构造
            try {
                Constructor constructor = cl.getDeclaredConstructor();
                //设置无参构造方法可访问
                constructor.setAccessible(true);
                //产生一个实例对象
                try {
                    singleton = (Singleton)constructor.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //对外提供单例对象访问接口
    public static Singleton getSingleton(){


        return singleton;
    }

}
