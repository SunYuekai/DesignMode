package duty.hinge.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-10 ����5:05
 **/
public abstract class Woman implements IWoman{
    /**
     * 1:Ů��
     * 2:����
     * 3:�Ѹ�
     *
     */
    private int type = 0;


    private String request;


    public Woman(int type, String request) {
        this.type = type;
        this.request = request;
    }

    public void Request(){




        if(this.type == 1){


            System.out.println("Ů������ʾ��"+request);
        }else
        if(this.type == 2){


            System.out.println("���ӵ���ʾ��"+request);
        }
        else if(this.type == 3){


            System.out.println("�Ѹ�����ʾ��"+request);
        }



    }


    public int getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }
}
