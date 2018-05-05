package iteraor.mode;

import java.util.Vector;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午2:30
 **/
public class ConcreteAggregate implements Aggregate {

    //容纳对象的容器
    private Vector vector = new Vector();
    //增加一个元素
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
