package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 ����5:20
 **/
public class Father extends Handler {
    public Father(int level) {
        super(level);
    }


    @Override
    public void response(Woman woman) {



        System.out.println("���׶�Ů���Ļظ�");
        System.out.println(woman.getRequest());

        System.out.println("ͬ��");
    }


}
