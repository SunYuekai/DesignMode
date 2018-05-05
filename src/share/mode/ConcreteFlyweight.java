package share.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 ÉÏÎç11:42
 **/
public class ConcreteFlyweight extends  Flyweight {


    public ConcreteFlyweight(String entrinsic) {
        super(entrinsic);
    }

    @Override
    void operate() {

        System.out.println("ÒµÎñÂß¼­2");

    }
}
