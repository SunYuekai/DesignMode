package builder_mode;

import java.util.ArrayList;

/**
 * �Ż�:��ͬ��ģ�Ͷ�Ӧ��ͬ��builder ���ز�ͬģ�Ͷ���
 * ���󷽷�:ҵ���߼�
 * @author Yuekai.sun
 * @create 2018-03-30 ����3:42
 **/
public abstract class CarBuilder {


    protected abstract void setSequence(ArrayList<String> sequence);

    protected abstract CarModel getModel();






}
