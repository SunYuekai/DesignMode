package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 ����5:31
 **/
public class Son extends Handler {
    public Son(int level) {
        super(level);
    }

    @Override



    public void response(Woman woman) {



        System.out.println("���Ӷ�ĸ�׵Ļظ�");
        System.out.println(woman.getRequest());

        System.out.println("ͬ��");




    }
}
