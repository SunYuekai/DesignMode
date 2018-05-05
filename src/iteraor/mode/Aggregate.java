package iteraor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 обнГ2:25
 **/
public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator iterator();


}
