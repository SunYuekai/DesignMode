package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 下午5:31
 **/
public class Son extends Handler {
    public Son(int level) {
        super(level);
    }

    @Override



    public void response(Woman woman) {



        System.out.println("儿子对母亲的回复");
        System.out.println(woman.getRequest());

        System.out.println("同意");




    }
}
