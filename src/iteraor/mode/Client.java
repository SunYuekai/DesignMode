package iteraor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 下午2:34
 **/
public class Client {

    public static void main(String[] args) {

        //声明容器
        Aggregate agg = new ConcreteAggregate();
        //加入数据
        agg.add("a");
        agg.add("b");
        agg.add("c");
        //遍历

        Iterator iterator  = agg.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
