package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 ����5:33
 **/
public class Husband extends Handler {
    public Husband(int level) {
        super(level);
    }

    @Override
    public void response(Woman woman) {

        System.out.println("�ɷ�����ӵĻظ�");
        System.out.println(woman.getRequest());

        System.out.println("ͬ��");


    }
}
