package adapt.mode;


import java.applet.Applet;

/**
 * ��������ɫ(����)�̳�Դ��ɫ(��ת����ɫ)��ʵ��Ŀ���ɫ�����ӿ�
 * @author Yuekai.sun
 * @create 2018-04-12 ����11:22
 **/
public class Adapter extends Adaptee implements Target {


    @Override
    //�ڴ˷����з�װ(adapteeԴĿ�����super�ķ���ʵ��ҵ���߼����)
    public void request() {

        super.doSomething();


    }



}
