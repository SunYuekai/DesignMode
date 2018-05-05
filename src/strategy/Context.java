package strategy;

/**��װ�������� ʵ�ֲ��Ի���
 * @author Yuekai.sun
 * @create 2018-04-12 ����10:40
 **/
public class Context {


    private Istrategy stategy;

    public Context(Istrategy stategy) {
        this.stategy = stategy;
    }

    public void exec(){
        this.stategy.doSomething();



    }





}
