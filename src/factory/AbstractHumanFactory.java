package factory;

/**
 * @author Yuekai.sun
 * @create 2018-03-29 ����5:15
 **/
public abstract  class AbstractHumanFactory {

    /**
     *
     * @param c ����human��class�����
     * @param <T> ���÷��� ����ǿת
     * @return
     */
    public abstract <T extends Human>T createHuman(Class<T> c );




}
