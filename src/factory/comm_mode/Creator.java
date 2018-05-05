package factory.comm_mode;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 обнГ5:44
 **/
public abstract class Creator {

    public abstract <T extends Product> T createProdcut(Class<T> c );

}
