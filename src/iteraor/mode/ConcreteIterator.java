package iteraor.mode;

import java.util.Vector;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午2:19
 **/
public class ConcreteIterator implements Iterator {

    private Vector vector = new Vector();
    //定义游标
    public int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {

        Object result = null;
        if(this.hasNext()){

            result = this.vector.get((this.cursor++));


            return result;

        }
        return null;
    }

    @Override
    public boolean hasNext() {

        if (this.cursor == vector.size())

            return false;
        return true;
    }

    @Override
    public boolean remove() {

        this.vector.remove(this.cursor);
        return true;
    }
}
