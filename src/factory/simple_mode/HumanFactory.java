package factory.simple_mode;

import factory.Human;

/**
 * �򵥹���ģʽ �ֳ�Ϊ��̬����ģʽ
 * �仯:ȥ�����󹤳��� ������ʵ����������Ϊ��̬
 * @author Yuekai.sun
 * @create 2018-03-30 ����10:54
 **/
public class HumanFactory {


    public static <T extends Human> T createHuman(Class<T> c) {

        //����һ��������������
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
