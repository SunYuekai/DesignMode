package backup.mode;

/**备忘录模式:备忘录管理者
 * @author Yuekai.sun
 * @create 2018-04-12 下午4:54
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
