package model_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����2:20
 **/
public class HummerH1 extends HummerModel {


    @Override
    public void start() {

        System.out.println("H1 ����");
    }

    @Override
    public void alarm() {
        System.out.println("H1 ����");

    }

    @Override
    public void engineBoom() {
        System.out.println("H1������");

    }

    @Override
    public void stop() {

        System.out.println("H1ͣ��");

    }
}
