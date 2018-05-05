package duty.hinge.mode;

/**������ģʽ ÿ������ֻ����һ���������� ��������֮���д��ݹ�ϵ
 * �ڳ������е��ó��󷽷� ��ȥ��������ʵ��
 * @author Yuekai.sun
 * @create 2018-04-10 ����4:40
 **/
public abstract class Handler {

    //����ȼ�
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int MOTHER_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //�ܴ���ļ���
    private int level = 0;
    //������һ��������
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }
    //���崫���������ķ���������������(���ķ��� ���಻����д)
    public final void handleMessage(Woman woman) {


        if (this.level == woman.getType()) {

            this.response(woman);


        } else if (this.nextHandler != null) {


            this.nextHandler.handleMessage(woman);
        } else {

            System.out.println("�޺���������");
        }


    }



//    ���幫�����󷽷� ���л�Ӧ
    public abstract void response(Woman woman);
    }





