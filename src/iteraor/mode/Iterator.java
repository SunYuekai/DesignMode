package iteraor.mode;

/**������ģʽ Ϊ��ʵ�ֶ���ı��� Iterator add remove hasNext Aggregate add remove iterator(���ص�����)
 * @author Yuekai.sun
 * @create 2018-04-12 ����2:10
 **/
public interface Iterator {


    //��������һ��Ԫ��
    Object next();
    //�Ƿ��ѵ�β��
    boolean hasNext();
    //ɾ����ǰָ���Ԫ��
    boolean remove();


}
