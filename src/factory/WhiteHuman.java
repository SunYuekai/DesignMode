package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 ����5:11
 **/
public class WhiteHuman implements  Human{


    @Override
    public void getColor() {
        System.out.println("��ɫ");
    }

    @Override
    public void talk() {
        System.out.println("���ǰ�ɫ��");

    }
}
