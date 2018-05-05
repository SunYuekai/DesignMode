package iteraor.mode;

import java.util.Vector;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����2:30
 **/
public class ConcreteAggregate implements Aggregate {

    //���ɶ��������
    private Vector vector = new Vector();
    //����һ��Ԫ��
    @Override
    public void add(Object object) {
        this.vector.add(object);

    }

    @Override
    public void remove(Object object) {
    this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);

    }
}
