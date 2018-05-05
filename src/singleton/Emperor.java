package singleton;

/**
 *
 * Demo class
 * ����:����ʱΪ�մ�������
 * ��:���ʼ����������
 * ����̰߳�ȫ:��˫�����ṹ ʹ��synchronized
 * ��չ:��ֻ��Ҫ�������� ˽�л����췽�� ʹ�þ�̬���������������� ʹ��vector�̰߳�ȫ������
 * @author Yuekai.Sun
 * @create 2018-03-29 ����4:18
 */
public class Emperor {
    //��ʼ��һ���ʵ�
    private static final Emperor emperor = new Emperor();

    private Emperor() {

        //˽�й��췽�� Ŀ�Ĳ������ڶ����ʵ�

    }

    public static Emperor getInstance() {
        //ͨ�����������ṩʵ�� ��֤��һ����


        return emperor;

    }

    public  void say() {

        System.out.println("���ǻʵ�001..."+this.toString());


    }
}
