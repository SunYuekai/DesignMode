package adapt.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����11:25
 **/
public class Client {

    public static void main(String[] args) {

        //ԭ�е�ҵ���߼�
        Target target = new ConcreteTarget();
        target.request();
        //������������ɫ���ҵ���߼�
        Target target2 = new Adapter();
        target2.request();

    }
}
