package iteraor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����2:34
 **/
public class Client {

    public static void main(String[] args) {

        //��������
        Aggregate agg = new ConcreteAggregate();
        //��������
        agg.add("a");
        agg.add("b");
        agg.add("c");
        //����

        Iterator iterator  = agg.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
