package proxy_mode.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Yuekai.sun
 * @create 2018-04-09 ����4:30
 **/
public class GamePlayIH implements InvocationHandler
{
//    ���������class��ʵ��
     Class cls = null;
//    ������ʵ��
     Object player = null;

    public GamePlayIH(Object player) {
        this.player = player;
    }
//ѭ������invoke
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//������� ������ʵ������ �����������÷�������Ĳ���
        Object result = method.invoke(this.player,args);

        return result;

    }
}
