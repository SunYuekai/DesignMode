package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 下午5:15
 **/
public abstract  class AbstractHumanFactory {

    /**
     *
     * @param c 传入human的class类对象
     * @param <T> 采用泛型 无需强转
     * @return
     */
    public abstract <T extends Human>T createHuman(Class<T> c );




}
