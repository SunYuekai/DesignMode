package observe.mode;

import java.util.Observable;

/**�۲���ģʽ ���۲���ʵ�ָ��Ի��ӿ� observable ���۲�ӿ�
 *
 *
 * @author Yuekai.sun
 * @create 2018-04-12 ����3:48
 **/
public class HanFeiZi extends Observable implements IHanFeiZi{


    @Override
    public void haveBreakFast() {
        System.out.println("�������ڳ��緹");
        super.setChanged();
        super.notifyObservers("�ڳԷ�");
    }

    @Override
    public void sleep() {

        System.out.println("��������˯��");


        super.setChanged();
        super.notifyObservers("��˯��");

    }
}
