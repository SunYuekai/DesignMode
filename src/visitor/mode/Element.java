package visitor.mode;

/**
 * @author Yuekai.sun
 * @create 2018-04-12 ����5:19
 **/
public abstract class Element {

    //ҵ���߼�
    abstract void doSomething();
    //�����ĸ������߷���
    abstract void accept(Ivisitor visitor);

}
