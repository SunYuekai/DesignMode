package share.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-16 ����11:41
 **/
public class ConcreteFlyweight1 extends Flyweight {


    public ConcreteFlyweight1(String entrinsic) {
        super(entrinsic);
    }

    @Override
    void operate() {

        System.out.println("ҵ���߼�1");

    }
}
