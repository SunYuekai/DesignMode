package share.mode;

/**��Ԫģʽ
 * �ڲ�״̬:���滷���ı��״̬ �ɹ����״̬
 * �ⲿ״̬:���滷���ı��״̬ ���ɹ����״̬ ͨ��ʹ�� JAVA�Դ�����(������дequals��hashcode����)���ܽϺ�
 * @author Yuekai.sun
 * @create 2018-04-16 ����11:36
 **/
public abstract class Flyweight {



    //�ڲ�״̬
    private String intrinsic;
    //�ⲿ״̬ final���α����ʼ��ֵ
    protected final String Entrinsic;

    public Flyweight(String entrinsic) {
        Entrinsic = entrinsic;
    }

    //����ҵ�����
    abstract void operate();
    //�ڲ�״̬��getter/setter


    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
