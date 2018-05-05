package iteraor.mode;

/**迭代器模式 为了实现对象的遍历 Iterator add remove hasNext Aggregate add remove iterator(返回迭代器)
 * @author Yuekai.sun
 * @create 2018-04-12 下午2:10
 **/
public interface Iterator {


    //遍历到下一个元素
    Object next();
    //是否已到尾部
    boolean hasNext();
    //删除当前指向的元素
    boolean remove();


}
