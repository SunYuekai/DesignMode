package factory.comm_mode;

/**
 * �����Ʒ:�൱��Human�ӿ� �ɳ������������������д�ĳ��󷽷�
 * @author Yuekai.sun
 * @create 2018-03-29 ����5:33
 **/
public abstract  class Product {

    //��Ʒ��������
    public void commMethod(){
        System.out.println("��������");
    }
    //��������������������
    public abstract  void speMethod();

}
