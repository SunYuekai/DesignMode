package factory.factory_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����11:06
 **/
public class SingletonFactory {

    private static Singleton singleton ;

    static {


        try {
            Class cl = Class.forName(SingletonFactory.class.getName());

            //����޲ι���
            try {
                Constructor constructor = cl.getDeclaredConstructor();
                //�����޲ι��췽���ɷ���
                constructor.setAccessible(true);
                //����һ��ʵ������
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

    //�����ṩ����������ʽӿ�
    public static Singleton getSingleton(){


        return singleton;
    }

}
