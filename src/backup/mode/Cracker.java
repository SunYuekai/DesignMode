package backup.mode;

/**����¼ģʽ:����¼������
 * @author Yuekai.sun
 * @create 2018-04-12 ����4:54
 **/
public class Cracker {

    private Memento memento ;

    public Cracker(Memento memento) {


        this.memento = memento;
    }


    public Memento getMemento() {
        return memento;
    }
}
