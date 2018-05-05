package builder_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-30 ����3:23
 **/
public class BMWModel extends CarModel {


    @Override
    protected void start() {
        System.out.println("��������");
    }

    @Override
    protected void alarm() {

        System.out.println("�������");

    }

    @Override
    protected void engineBoom() {

        System.out.println("����������");

    }

    @Override
    protected void stop() {
        System.out.println("����ֹͣ");

    }
}
