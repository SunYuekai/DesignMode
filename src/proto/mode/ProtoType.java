package proto.mode;

/**
 * ԭ��ģʽ:���ƶ������� �޸Ķ�����Ի�����
 * Ӧ�ó���:������̲߳�������(��������޹�)
 * ǳ����:�������ڲ����� ���:�����ڲ����ö�������� ��дclone�����е����������clone����
 * ԭ��ģ�Ͳ���ִ�й��췽�� ���������ڴ��������
 * @author Yuekai.sun
 * @create 2018-04-09 ����6:56
 **/
public class ProtoType implements  Cloneable{


    @Override
    protected ProtoType clone() throws CloneNotSupportedException {
        return (ProtoType)super.clone();
    }
}



