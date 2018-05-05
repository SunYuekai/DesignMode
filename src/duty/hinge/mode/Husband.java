package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 下午5:33
 **/
public class Husband extends Handler {
    public Husband(int level) {
        super(level);
    }

    @Override
    public void response(Woman woman) {

        System.out.println("丈夫对妻子的回复");
        System.out.println(woman.getRequest());

        System.out.println("同意");


    }
}
