package proxy_mode.example.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Yuekai.sun
 * @create 2018-04-09 ����5:18
 **/

    class Handler implements InvocationHandler
    {
        private Object tar;
        //��ί�ж��󣬲����ش�����
        public Object bind(Object tar)
        {
            this.tar = tar;
            //�󶨸���ʵ�ֵ����нӿڣ�ȡ�ô�����
            return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
                    tar.getClass().getInterfaces(),
                    this);
        }
        public Object invoke(Object proxy , Method method , Object[] args)throws Throwable//����������ӿ�ʵ��
        {
            Object result = null;//�����������ΪObject����
            //����Ϳ��Խ�����ν��AOP�����
            //�ڵ��þ��庯������ǰ��ִ�й��ܴ���
            result = method.invoke(tar,args);
            //�ڵ��þ��庯��������ִ�й��ܴ���
            return result;
        }
    }
